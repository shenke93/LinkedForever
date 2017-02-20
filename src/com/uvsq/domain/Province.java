package com.uvsq.domain;

import java.util.Set;

public class Province implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Country country;
	private Set<City> cities;
	private Set<Student> students;

	public Integer getId() 
	{
		return id;
	}

	public void setId(Integer id) 
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public Country getCountry() 
	{
		return country;
	}
	
	public void setCountry(Country country) 
	{
		this.country = country;
	}
	
	public Set<City> getCities() 
	{
		return cities;
	}

	public void setCities(Set<City> cities) 
	{
		this.cities = cities;
	}
	
	public Set<Student> getStudents() 
	{
		return students;
	}

	public void setStudents(Set<Student> students) 
	{
		this.students = students;
	}
}