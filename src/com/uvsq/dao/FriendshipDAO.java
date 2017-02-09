package com.uvsq.dao;

import java.util.ArrayList;
import java.util.List;

import com.uvsq.domain.Friendship;
import com.uvsq.domain.Student;
import com.uvsq.idao.IFriendshipDAO;

public class FriendshipDAO extends BasicDAO implements IFriendshipDAO 
{
	public void makeFriend(Student s1, Student s2) 
	{
		Friendship f = new Friendship();
		f.setFriendRequester(s1);
		f.setFriendReceiver(s2);
		this.add(f);
	}
	
	public void deleteFriend(Student s1, Student s2) 
	{
		String hql = "from Friendship f where f.friendRequester=? and f.friendReceiver =?";
		Object[] parameters = {s1, s2};
		
		Friendship f = (Friendship) this.uniqueQuery(hql, parameters);
		this.delete(Friendship.class, f.getId());
	}

	public List<Student> showFriendList(Student s) 
	{
		String hql = "select f.friendReceiver from Friendship f where f.friendRequester=?";
		Object[] parameters = {s};
		
		List<Object> l1 = (List<Object>) this.executeQuery(hql, parameters);
		
		if(l1.size() == 0)
		{
			return null;
		}
		else
		{
			List<Student> l2 = new ArrayList<Student>();
			
			for(Object o : l1)
			{
				l2.add((Student) o);
			}
			
			return l2;
		}
	}

	public boolean isFriend(Student s1, Student s2)
	{
		String hql = "from Friendship f where f.friendRequester=? and f.friendReceiver =?";
		Object[] parameters = {s1, s2};
		
		Friendship f = (Friendship) this.uniqueQuery(hql, parameters);
		
		if(f == null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}