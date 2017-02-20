package com.uvsq.domain;

public class Friendship 
{
	private Integer id;
	private Student friendRequester;
	private Student friendReceiver;
	
	public Integer getId()
	{
		return id;
	}
	
	public void setId(Integer id)
	{
		this.id = id;
	}
	
	public Student getFriendRequester() 
	{
		return friendRequester;
	}

	public void setFriendRequester(Student friendRequester) 
	{
		this.friendRequester = friendRequester;
	}

	public Student getFriendReceiver() 
	{
		return friendReceiver;
	}

	public void setFriendReceiver(Student friendReceiver) 
	{
		this.friendReceiver = friendReceiver;
	}
}