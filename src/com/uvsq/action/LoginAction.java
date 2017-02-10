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

import com.uvsq.domain.Post;
import com.uvsq.domain.Student;
import com.uvsq.form.LoginForm;
import com.uvsq.idao.IFriendshipDAO;
import com.uvsq.idao.IPostDAO;
import com.uvsq.idao.IStudentDAO;

public class LoginAction extends DispatchAction 
{
	private IStudentDAO iStudentDAO;
	private IFriendshipDAO iFriendshipDAO;
	private IPostDAO iPostDAO;
	
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

	public ActionForward login(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) 
	{
		LoginForm loginForm = (LoginForm) form;

		Student s_forChecking = new Student();
		s_forChecking.setEmail(loginForm.getUsername());
		s_forChecking.setPwd(loginForm.getPassword());
		
		Student  s_result = iStudentDAO.checkStuByEmail(s_forChecking);
		
		if(s_result !=null )
		{	
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
		else
		{
			request.setAttribute("errInfo", true);
			return mapping.findForward("tosignin");
		}
	}
	
	public ActionForward logout(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response)
	{
		request.getSession().invalidate();
		
		return mapping.findForward("logout");
	}
}