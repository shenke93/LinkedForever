package com.domain;

public class StuUniversity 
{
	private Integer id;
	private Student student;
	private University university;
	private Integer year;
	
	public Integer getId() 
	{
		return id;
	}
	
	public void setId(Integer id) 
	{
		this.id = id;
	}
	
	public Student getStudent() 
	{
		return student;
	}
	
	public void setStudent(Student student) 
	{
		this.student = student;
	}
	
	public University getUniversity()
	{
		return university;
	}
	
	public void setUniversity(University university) 
	{
		this.university = university;
	}
	
	public Integer getYear()
	{
		return year;
	}
	
	public void setYear(Integer year) 
	{
		this.year = year;
	}
}