package com.uvsq.domain;

import java.util.Set;

public class Student implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String email;
	private String pwd;
	private String sex;
	private String birthday;
	private String tel;
	private Country homeCountry;
	private Province homePro;
	private City homeCity;
	private University university;
	private Set<Post> posts;
	private Set<Photo> photos;
	private Set<Friendship> requestedFriends;
	private Set<Friendship> receivedFriends;

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
	
	public Country getHomeCountry() 
	{
		return homeCountry;
	}

	public void setHomeCountry(Country homeCountry) 
	{
		this.homeCountry = homeCountry;
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
	
	public University getUniversity() 
	{
		return university;
	}

	public void setUniversity(University university) 
	{
		this.university = university;
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
	
	public Set<Friendship> getRequestedFriends() 
	{
		return requestedFriends;
	}

	public void setRequestedFriends(Set<Friendship> requestedFriends) 
	{
		this.requestedFriends = requestedFriends;
	}

	public Set<Friendship> getReceivedFriends() 
	{
		return receivedFriends;
	}

	public void setReceivedFriends(Set<Friendship> receivedFriends) 
	{
		this.receivedFriends = receivedFriends;
	}
}