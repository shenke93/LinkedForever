package com.uvsq.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.uvsq.domain.Comment;
import com.uvsq.domain.Post;
import com.uvsq.domain.Student;
import com.uvsq.form.HomepageForm;
import com.uvsq.idao.ICommentDAO;
import com.uvsq.idao.IFriendshipDAO;
import com.uvsq.idao.IPostDAO;
import com.uvsq.idao.IStudentDAO;

public class HomepageAction extends DispatchAction 
{
	private IStudentDAO iStudentDAO;
	private IFriendshipDAO iFriendshipDAO;
	private IPostDAO iPostDAO;
	private ICommentDAO iCommentDAO;

	public void setiCommentDAO(ICommentDAO iCommentDAO) 
	{
		this.iCommentDAO = iCommentDAO;
	}

	public void setiFriendshipDAO(IFriendshipDAO iFriendshipDAO) 
	{
		this.iFriendshipDAO = iFriendshipDAO;
	}

	public void setiStudentDAO(IStudentDAO iStudentDAO) 
	{
		this.iStudentDAO = iStudentDAO;
	}
	
	public void setiPostDAO(IPostDAO iPostDAO)
	{
		this.iPostDAO = iPostDAO;
	}

	public ActionForward tohomepage(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) 
	{	
		Student s = (Student) request.getSession().getAttribute("userInfo");
		Student s_result = iStudentDAO.getStuById(s.getId());
		
		List<Post> showPosts = new ArrayList<Post>();
		
		List<Post> monPosts = iPostDAO.showPostList(s_result);
		if(monPosts != null)
		{
			showPosts.addAll(monPosts);
		}
		
		List<Student> friends = iFriendshipDAO.showFriendList(s_result);
		
		if(friends != null)
		{
			for(Student stu : friends)
			{
				List<Post> posts = iPostDAO.showPostList(stu);
				
				if(posts != null)
				{
					showPosts.addAll(posts);
				}
			}
		}
		
		Collections.sort(showPosts);
		
		request.getSession().setAttribute("userInfo", s_result);
		request.getSession().setAttribute("showPosts", showPosts);
		
		return mapping.findForward("tohomepage");
	}
	
	public ActionForward tosearchFriend(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) 
	{	
		request.getSession().setAttribute("friendInfo", null);
		return mapping.findForward("searchFriend");
	}
	
	public ActionForward searchFriend(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) 
	{
		HomepageForm homepageForm = (HomepageForm) form;
		
		request.getSession().setAttribute("friendInfo", null);
		List<Student> lists = iStudentDAO.getStuByName(homepageForm.getFriendname());
		
		if(lists != null)
		{
			request.getSession().setAttribute("friendInfo", lists);
		}
		
		return mapping.findForward("searchFriend");
	}
	
	public ActionForward addFriend(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) 
	{	
		String friendId = request.getParameter("friendId");
		
		Student s1 = (Student) request.getSession().getAttribute("userInfo");
		Student s2 = iStudentDAO.getStuById(Integer.parseInt(friendId));
		
		if(!iFriendshipDAO.isFriend(s1, s2))
		{
			iFriendshipDAO.makeFriend(s1, s2);
		}
		
		request.getSession().setAttribute("userProfile", s2);
		request.getSession().setAttribute("showAdd", false);
		request.getSession().setAttribute("isfriend", true);
		return mapping.findForward("toprofile");
	}
	
	public ActionForward Myprofile(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) 
	{
		Student s = (Student) request.getSession().getAttribute("userInfo");
		s = iStudentDAO.getStuById(s.getId());
		
		request.getSession().setAttribute("userProfile", s);
		request.getSession().setAttribute("showAdd", false);
		request.getSession().setAttribute("isfriend", false);
		return mapping.findForward("toprofile");
	}
	
	public ActionForward Friendprofile(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) 
	{
		Student s1 = (Student) request.getSession().getAttribute("userInfo");
		
		String friendId = request.getParameter("friendId");
		Student s2 = iStudentDAO.getStuById(Integer.parseInt(friendId));
		
		if(iFriendshipDAO.isFriend(s1, s2))
		{
			request.getSession().setAttribute("showAdd", false);
			request.getSession().setAttribute("isfriend", true);
		}
		else
		{
			request.getSession().setAttribute("showAdd", true);
			request.getSession().setAttribute("isfriend", false);
		}
		
		request.getSession().setAttribute("userProfile", s2);
		return mapping.findForward("toprofile");
	}
	
	public ActionForward friendList(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) 
	{
		Student s = (Student) request.getSession().getAttribute("userInfo");
		Student s_result = iStudentDAO.getStuById(s.getId());
		
		List<Student> friendList = iFriendshipDAO.showFriendList(s_result);
		
		if(friendList != null)
		{
			request.getSession().setAttribute("friendList", friendList);
		}
		else
		{
			request.getSession().setAttribute("friendList", null);
		}
		
		return mapping.findForward("tofriendlist");
	}
	
	public ActionForward post(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) 
	{	
		HomepageForm homepageForm = (HomepageForm) form;
		
		Student s = (Student) request.getSession().getAttribute("userInfo");
		
		if(homepageForm.getContent_post().length() != 0)
		{
			Post p = new Post();
			p.setContent(homepageForm.getContent_post());
			p.setNumLike(0);
			p.setNumHate(0);
			p.setStudent(s);
			
			iPostDAO.add(p);
		}
		else
		{
			request.setAttribute("errInfo", true);
		}
		
		return this.tohomepage(mapping, homepageForm, request, response);
	}
	
	public ActionForward like(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) 
	{
		String postId = request.getParameter("postId");
		
		Post p = (Post) iPostDAO.findById(Post.class, Integer.parseInt(postId));
		p.setNumLike(p.getNumLike() + 1);
		iPostDAO.update(p);
		
		return this.tohomepage(mapping, form, request, response);
	}
	
	public ActionForward hate(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) 
	{
		String postId = request.getParameter("postId");
		
		Post p = (Post) iPostDAO.findById(Post.class, Integer.parseInt(postId));
		p.setNumHate(p.getNumHate() + 1);
		iPostDAO.update(p);
		
		return this.tohomepage(mapping, form, request, response);
	}
	
	public ActionForward comment(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) 
	{
		HomepageForm homepageForm = (HomepageForm) form;
		String postId = request.getParameter("postId");
		
		if(homepageForm.getContent_comment().length() != 0)
		{
			Post p = (Post) iPostDAO.findById(Post.class, Integer.parseInt(postId));
			Student s = (Student) request.getSession().getAttribute("userInfo");
			
			Comment c = new Comment();
			c.setStudent(s);
			c.setContent(homepageForm.getContent_comment());
			c.setPost(p);
			
			iCommentDAO.add(c);
		}
		else
		{
			request.setAttribute("commenterr", true);
			request.setAttribute("postnum", Integer.parseInt(postId));
		}
		
		return this.tohomepage(mapping, homepageForm, request, response);
	}
}