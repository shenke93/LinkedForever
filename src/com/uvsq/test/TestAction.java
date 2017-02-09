package com.uvsq.test;

import java.util.List;

import com.uvsq.domain.City;
import com.uvsq.domain.Country;
import com.uvsq.domain.Post;
import com.uvsq.domain.Province;
import com.uvsq.domain.Student;
import com.uvsq.domain.University;
import com.uvsq.idao.ICityDAO;
import com.uvsq.idao.ICountryDAO;
import com.uvsq.idao.IFriendshipDAO;
import com.uvsq.idao.IPostDAO;
import com.uvsq.idao.IProvinceDAO;
import com.uvsq.idao.IStudentDAO;
import com.uvsq.idao.IUniversityDAO;

public class TestAction 
{
	private ICountryDAO iCountryDAO; 
	private IProvinceDAO iProvinceDAO;
	private ICityDAO iCityDAO;
	private IUniversityDAO iUniversityDAO;
	private IFriendshipDAO iFriendshipDAO;
	private IStudentDAO iStudentDAO;
	private IPostDAO iPostDAO;

	public void setiPostDAO(IPostDAO iPostDAO) 
	{
		this.iPostDAO = iPostDAO;
	}

	public void setiStudentDAO(IStudentDAO iStudentDAO) 
	{
		this.iStudentDAO = iStudentDAO;
	}

	public void setiFriendshipDAO(IFriendshipDAO iFriendshipDAO) 
	{
		this.iFriendshipDAO = iFriendshipDAO;
	}

	public void setiUniversityDAO(IUniversityDAO iUniversityDAO) 
	{	
		this.iUniversityDAO = iUniversityDAO;
	}

	public void setiProvinceDAO(IProvinceDAO iProvinceDAO) 
	{
		this.iProvinceDAO = iProvinceDAO;
	}
	
	public void setiCountryDAO(ICountryDAO iCountryDAO) 
	{
		this.iCountryDAO = iCountryDAO;
	}
	
	public void setiCityDAO(ICityDAO iCityDAO) 
	{
		this.iCityDAO = iCityDAO;
	}
	
	public void runTest1()
	{
		Country c = new Country();
		c.setName("France");
		
		iCountryDAO.add(c);
		
		Province p1 = new Province();
		p1.setName("Paris");
		p1.setCountry(c);
		
		Province p2 = new Province();
		p2.setName("Essonne");
		p2.setCountry(c);
		
		Province p3 = new Province();
		p3.setName("Yvelines");
		p3.setCountry(c);
		
		Province p4 = new Province();
		p4.setName("Hauts-de-Seine");
		p4.setCountry(c);
		
		iProvinceDAO.add(p1);
		iProvinceDAO.add(p2);
		iProvinceDAO.add(p3);
		iProvinceDAO.add(p4);
		
		City c1 = new City();
		c1.setName("Paris");
		c1.setProvince(p1);
		
		City c2 = new City();
		c2.setName("Evry");
		c2.setProvince(p2);
		
		City c3 = new City();
		c3.setName("Versailles");
		c3.setProvince(p3);
		
		City c4 = new City();
		c4.setName("Courbevoie");
		c4.setProvince(p4);
		
		iCityDAO.add(c1);
		iCityDAO.add(c2);
		iCityDAO.add(c3);
		iCityDAO.add(c4);
		
		University u1 = new University();
		u1.setName("ENSIIE");
		u1.setCity(c2);
		
		University u2 = new University();
		u2.setName("UVSQ");
		u2.setCity(c3);
		
		iUniversityDAO.add(u1);
		iUniversityDAO.add(u2);
	}
	
	public void runTest2()
	{
		Student s1 = new Student();
		s1.setName("aaa");
		s1.setEmail("aaa@sohu.com");
		s1.setTel("123456");
		s1.setPwd("1234");
		
		Student s2 = new Student();
		s2.setName("bbb");
		s2.setEmail("bbb@sohu.com");
		s2.setTel("123456");
		s2.setPwd("1234");
		
		Student s3 = new Student();
		s3.setName("ccc");
		s3.setEmail("ccc@sohu.com");
		s3.setTel("123456");
		s3.setPwd("1234");
		
		iStudentDAO.add(s1);
		iStudentDAO.add(s2);
		iStudentDAO.add(s3);
		
		iFriendshipDAO.makeFriend(s1, s2);
		iFriendshipDAO.makeFriend(s2, s1);
		iFriendshipDAO.makeFriend(s1, s3);
		iFriendshipDAO.makeFriend(s3, s1);
		iFriendshipDAO.makeFriend(s2, s3);
	}
	
	public void runTest3()
	{
		Student s1 = iStudentDAO.getStuById(14);
		Student s2 = iStudentDAO.getStuById(11);
		Student s3 = iStudentDAO.getStuById(12);
		Student s4 = iStudentDAO.getStuById(13);
		
		iFriendshipDAO.makeFriend(s1, s2);
		iFriendshipDAO.makeFriend(s1, s3);
		iFriendshipDAO.makeFriend(s1, s4);
		
		List<Student> lists = iFriendshipDAO.showFriendList(s1);
		
		for(Student stu : lists)
		{
			System.out.println(stu.getId());
			
		}
	}
	
	public void runTest4()
	{
		Student s1 = iStudentDAO.getStuById(14);
		Student s2 = iStudentDAO.getStuById(17);
		
		iFriendshipDAO.makeFriend(s1, s2);
	}
	
	public void runTest5()
	{
		Student s1 = iStudentDAO.getStuById(14);
		
		List<Post> lists = iPostDAO.showPostList(s1);
		for(Post p : lists)
		{
			System.out.println(p.getContent());
		}
	}
	
	public void runTest6()
	{
		Student s1 = iStudentDAO.getStuById(1);
		Student s2 = iStudentDAO.getStuById(17);
		
		System.out.println(iFriendshipDAO.isFriend(s1, s2));
	}
}