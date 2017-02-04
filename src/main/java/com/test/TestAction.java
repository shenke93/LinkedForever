package com.test;

import java.util.List;

import com.domain.*;
import com.idao.*;

public class TestAction 
{
	private ICountryDAO iCountryDAO;
	private IProvinceDAO iProvinceDAO;
	private IStudentDAO iStudentDAO;
	private ICityDAO iCityDAO;
	private IUniversityDAO iUniversityDAO;

	public void setiCountryDAO(ICountryDAO iCountryDAO) {
		this.iCountryDAO = iCountryDAO;
	}

	public void setiProvinceDAO(IProvinceDAO iProvinceDAO) {
		this.iProvinceDAO = iProvinceDAO;
	}

	public void setiStudentDAO(IStudentDAO iStudentDAO) {
		this.iStudentDAO = iStudentDAO;
	}

	public void setiCityDAO(ICityDAO iCityDAO) {
		this.iCityDAO = iCityDAO;
	}

	public void setiUniversityDAO(IUniversityDAO iUniversityDAO) {
		this.iUniversityDAO = iUniversityDAO;
	}
	
	public void addCountryTest() {
		Country c = new Country();
		c.setName("CHINA");
		
		iCountryDAO.add(c);
	}

	public void addProvinceTest() {
		Country c = iCountryDAO.getCountryById(1);
		Province p1 = new Province();
		p1.setName("Fujian");
		p1.setCountry(c);
		
		Province p2 = new Province();
		p2.setName("Beijing");
		p2.setCountry(c);
		
		iProvinceDAO.add(p1);
		iProvinceDAO.add(p2);
	}
	
	public void addCityTest() {
		City city1 = new City();
		city1.setName("Xiamen");
		
		City city2 = new City();
		city2.setName("Fuzhou");
		
		iCityDAO.add(city1);
		iCityDAO.add(city2);
	}
	
	public void addUniversityTest() {
		City city1 = iCityDAO.getCityById(1);
		University u1 = new University();
		u1.setName("Xiamen University");
		u1.setCity(city1);

		City city2 = iCityDAO.getCityById(2);
		University u2 = new University();
		u2.setName("Fuzhou University");
		u2.setCity(city2);

		iUniversityDAO.add(u1);
		iUniversityDAO.add(u2);
	}

	public void addStudentTest() {
		City c = iCityDAO.getCityById(1);
		Student s1 = new Student();
		s1.setName("Xiaoming");
		s1.setPwd("666");
		s1.setTel("01234567");
		s1.setHomeCity(c);
		s1.setSex("F");

		Student s2 = new Student();
		s2.setName("Laowang");
		s2.setPwd("111");
		s2.setTel("987654321");
		s2.setHomeCity(c);
		s2.setSex("M");

		iStudentDAO.add(s1);
		iStudentDAO.add(s2);
	}
	
	public void listCityTest() {
		List<City> list = iCityDAO.showCityList();
		
		for (City c : list) {
			System.out.println(c.getName());
		}
	}
	
	public void listStudentTest() {
		List<Student> list = iStudentDAO.showStudentList();
		
		for (Student s : list) {
			System.out.println(s.getName());
		}
	}
	
	public void listUniversityTest() {
		List<University> list = iUniversityDAO.showUniversityList();
		
		for (University u : list) {
			System.out.println(u.getName());
		}
	}
	
	public void listCountryTest() {
		List<Country> list = iCountryDAO.showCountryList();
		
		for (Country c : list)
		{
			System.out.println(c.getName());
		}
	}
	
	public void listProvinceTest()
	{
		List<Province> list = iProvinceDAO.showProvinceList();
		
		for(Province p : list)
		{
			System.out.println(p.getName());
		}
	}
}