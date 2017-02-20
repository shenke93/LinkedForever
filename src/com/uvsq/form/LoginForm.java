package com.uvsq.form;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm 
{
	private static final long serialVersionUID = 1L;

	private String password;
	private String username;
	
	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}
}