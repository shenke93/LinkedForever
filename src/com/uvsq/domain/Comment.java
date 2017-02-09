package com.uvsq.domain;

public class Comment
{
	private Integer id;
	private String content;
	private Post post;
	private Photo photo;
	private Student student;
	
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
	
	public Post getPost() 
	{
		return post;
	}

	public void setPost(Post post) 
	{
		this.post = post;
	}

	public Photo getPhoto() 
	{
		return photo;
	}

	public void setPhoto(Photo photo)
	{
		this.photo = photo;
	}
	
	public Student getStudent() 
	{
		return student;
	}

	public void setStudent(Student student) 
	{
		this.student = student;
	}
}