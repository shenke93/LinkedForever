package com.uvsq.dao;

import java.util.ArrayList;
import java.util.List;

import com.uvsq.domain.Student;
import com.uvsq.idao.IStudentDAO;

public class StudentDAO extends BasicDAO implements IStudentDAO 
{
	public Student checkStuByEmail(Student s) 
	{
		String hql = "from Student where email=? and pwd=?";
		Object[] parameters = {s.getEmail(), s.getPwd()};
		
		return (Student) this.uniqueQuery(hql, parameters);
	}

	public List<Student> showStudentList() 
	{
		String hql = "from Student";
		
		List<Object> l1 = (List<Object>) this.executeQuery(hql, null);
		
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

	public Student getStuById(int id) 
	{
		String hql = "from Student where id=?";
		Object[] parameters = {id};
		
		return (Student) this.uniqueQuery(hql, parameters);
	}

	public List<Student> getStuByName(String name) 
	{
		String hql = "from Student where name=?";
		Object[] parameters = {name};
		
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

	public boolean isExist(String email) 
	{
		String hql = "from Student where email=?";
		Object[] parameters = {email};
		
		Student s = (Student) this.uniqueQuery(hql, parameters);
		
		if(s == null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}