package com.uvsq.domain;

import java.util.Set;

public class Post implements java.io.Serializable, Comparable<Post>
{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String content;
	private Student student;
	private Set<Comment> comments;
	private Integer numLike;
	private Integer numHate;

	public Integer getId() 
	{
		return id;
	}
	
	public void setId(Integer id) 
	{
		this.id = id;
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
	
	public Integer getNumLike()
	{
		return numLike;
	}

	public void setNumLike(Integer numLike) 
	{
		this.numLike = numLike;
	}

	public Integer getNumHate() 
	{
		return numHate;
	}

	public void setNumHate(Integer numHate)
	{
		this.numHate = numHate;
	}

	public int compareTo(Post o) 
	{
		if(this.id < o.id)
		{
			return 1;
		}
		else if(this.id > o.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}