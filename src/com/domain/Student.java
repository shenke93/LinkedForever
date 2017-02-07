package com.domain;

import java.util.Set;

public class Student 
{
	private Integer id;
	private String name;
	private String email;
	private String pwd;
	private String sex;
	private String birthday;
	private String tel;
	private Province homePro;
	private City homeCity;
	private Set<StuUniversity> stuUniversities;
	private Set<Post> posts;
	private Set<Photo> photos;

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
	
	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getPwd() 
	{
		return pwd;
	}
	
	public void setPwd(String pwd)
	{
		this.pwd = pwd;
	}
	
	public String getSex() 
	{
		return sex;
	}
	
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	
	public String getBirthday() 
	{
		return birthday;
	}

	public void setBirthday(String birthday) 
	{
		this.birthday = birthday;
	}
	
	public String getTel() 
	{
		return tel;
	}
	
	public void setTel(String tel) 
	{
		this.tel = tel;
	}
	
	public Province getHomePro() 
	{
		return homePro;
	}

	public void setHomePro(Province homePro)
	{
		this.homePro = homePro;
	}
	
	public City getHomeCity() 
	{
		return homeCity;
	}

	public void setHomeCity(City homeCity) 
	{
		this.homeCity = homeCity;
	}
	
	public Set<StuUniversity> getStuUniversities() 
	{
		return stuUniversities;
	}

	public void setStuUniversities(Set<StuUniversity> stuUniversities) 
	{
		this.stuUniversities = stuUniversities;
	}
	
	public Set<Post> getPosts() 
	{
		return posts;
	}

	public void setPosts(Set<Post> posts) 
	{
		this.posts = posts;
	}
	
	public Set<Photo> getPhotos() 
	{
		return photos;
	}

	public void setPhotos(Set<Photo> photos) 
	{
		this.photos = photos;
	}
}