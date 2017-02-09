package com.uvsq.dao;

import java.util.ArrayList;
import java.util.List;

import com.uvsq.domain.Post;
import com.uvsq.domain.Student;
import com.uvsq.idao.IPostDAO;

public class PostDAO extends BasicDAO implements IPostDAO 
{
	public List<Post> showPostList(Student s) 
	{
		String hql = "from Post p where p.student=?";
		Object[] parameters = {s};
		
		List<Object> l1 = (List<Object>) this.executeQuery(hql, parameters);
		
		if(l1.size() == 0)
		{
			return null;
		}
		else
		{
			List<Post> l2 = new ArrayList<Post>();
			
			for(Object o : l1)
			{
				l2.add((Post) o);
			}
			
			return l2;
		}
	}
}