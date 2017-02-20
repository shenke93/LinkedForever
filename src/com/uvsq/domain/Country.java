package com.uvsq.domain;

import java.util.Set;

public class Country implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Set<Province> provinces;
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
	
	public Set<Province> getProvinces() 
	{
		return provinces;
	}

	public void setProvinces(Set<Province> provinces) 
	{
		this.provinces = provinces;
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