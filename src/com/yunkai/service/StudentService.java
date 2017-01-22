package com.yunkai.service;

import java.util.ArrayList;
import java.util.List;

import com.yunkai.dao.HibernateUtil;
import com.yunkai.domain.Student;

public class StudentService 
{
	private HibernateUtil hibernateUtil;

	public void setHibernateUtil(HibernateUtil hibernateUtil) 
	{
		this.hibernateUtil = hibernateUtil;
	}
	
	public void addStu(Student s)
	{
		hibernateUtil.add(s);
	}
	
	public void deleteStu(int id)
	{
		hibernateUtil.delete(Student.class, id);
	}
	
	public void updateStu(Student s)
	{
		hibernateUtil.update(s);
	}
	
	public Student getStuById(int id)
	{
		String hql = "from Student where id=?";
		Object[] parameters = {id};
		
		return (Student) hibernateUtil.uniqueQuery(hql, parameters);
	}
	
	public List<Student> showAllStu()
	{
		String hql = "from Student";
		
		List<Object> l1 = (List<Object>) hibernateUtil.executeQuery(hql, null);
		
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
	
	public Student checkStu(Student s)
	{
		String hql = "from Student where id=? and pwd=?";
		Object[] parameters = {s.getId(), s.getPwd()};
		
		return (Student) hibernateUtil.uniqueQuery(hql, parameters);
	}
}