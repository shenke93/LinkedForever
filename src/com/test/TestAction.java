package com.test;

import java.util.List;

import com.domain.Province;
import com.domain.Student;
import com.idao.IProvinceDAO;
import com.idao.IStudentDAO;

public class TestAction 
{
	private IProvinceDAO iProvinceDAO;
	private IStudentDAO iStudentDAO;
	
	public void setiStudentDAO(IStudentDAO iStudentDAO)
	{
		this.iStudentDAO = iStudentDAO;
	}

	public void setiProvinceDAO(IProvinceDAO iProvinceDAO) 
	{
		this.iProvinceDAO = iProvinceDAO;
	}

	public void runTest()
	{
		List<Province> list = iProvinceDAO.showProvinceList();
		
		for(Province p : list)
		{
			System.out.println(p.getName() + " " );
		}
	}
	
	public void runTest2()
	{
		Student s = new Student();
		s.setEmail("123@gmail.com");
		s.setTel("123456");
		s.setPwd("1234");
		s.setBirthday("08/08/1992");
		
		iStudentDAO.add(s);
	}
	
	public void runTest3()
	{
		Student s = iStudentDAO.getStuById(10);
		
		s.setName("haha");
		iStudentDAO.update(s);
	}
}