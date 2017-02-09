package com.uvsq.domain;

import java.util.Set;

public class University implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private City city;
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
	
	public City getCity()
	{
		return city;
	}
	
	public void setCity(City city) 
	{
		this.city = city;
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