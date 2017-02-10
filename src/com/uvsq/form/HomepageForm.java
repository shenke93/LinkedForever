package com.uvsq.form;

import org.apache.struts.action.ActionForm;

public class HomepageForm extends ActionForm 
{
	private static final long serialVersionUID = 1L;
	
	private String friendname;
	private String content_post;
	private String content_comment;

	public String getFriendname() 
	{
		return friendname;
	}

	public void setFriendname(String friendname) 
	{
		this.friendname = friendname;
	}
	
	public String getContent_post() 
	{
		return content_post;
	}

	public void setContent_post(String content_post) 
	{
		this.content_post = content_post;
	}
	
	public String getContent_comment() 
	{
		return content_comment;
	}

	public void setContent_comment(String content_comment) 
	{
		this.content_comment = content_comment;
	}
}