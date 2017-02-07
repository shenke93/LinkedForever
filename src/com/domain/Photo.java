package com.domain;

import java.util.Set;

public class Photo 
{
	private Integer id;
	private Integer numlike;
	private String content;
	private Student student;
	private Set<Comment> comments;

	public Integer getId() 
	{
		return id;
	}
	
	public void setId(Integer id) 
	{
		this.id = id;
	}
	
	public Integer getNumlike() 
	{
		return numlike;
	}

	public void setNumlike(Integer numlike) 
	{
		this.numlike = numlike;
	}
	
	public String getContent() 
	{
		return content;
	}
	
	public void setContent(String content) 
	{
		this.content = content;
	}
	
	public Student getStudent() 
	{
		return student;
	}

	public void setStudent(Student student) 
	{
		this.student = student;
	}
	
	public Set<Comment> getComments()
	{
		return comments;
	}

	public void setComments(Set<Comment> comments) 
	{
		this.comments = comments;
	}
}