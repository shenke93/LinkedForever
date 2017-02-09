package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.domain.Student;
import com.idao.IStudentDAO;

public class StudentDAO extends BasicDAO implements IStudentDAO 
{
	public Student checkStu(Student s) 
	{
		String hql = "from Student where name=:name and pwd=:pwd";
		Object[] parameters = {s.getName(), s.getPwd()};
		String[] parameters_name = {"name", "pwd"};
		
		return (Student) this.uniqueQuery(hql, parameters, parameters_name);
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
		String hql = "from Student where id=:id";
		Object[] parameters = {id};
		String[] parameters_name = {"id"};
		
		return (Student) this.uniqueQuery(hql, parameters, parameters_name);
	}
}