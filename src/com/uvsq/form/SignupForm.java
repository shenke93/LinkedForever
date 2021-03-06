package com.uvsq.form;

import org.apache.struts.action.ActionForm;

public class SignupForm extends ActionForm 
{
	private static final long serialVersionUID = 1L;
	
	private String email;
	private String tel;
	private String password;
	private String name;
	private String sex;
	private String birthday;
	private String country;
	private String province;
	private String city;
	private String university;
	private String highSchool;
	private String secondarySchool;
	private String primarySchool;
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getTel()
	{
		return tel;
	}
	
	public void setTel(String tel)
	{
		this.tel = tel;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
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
	
	public String getCountry() 
	{
		return country;
	}

	public void setCountry(String country) 
	{
		this.country = country;
	}

	public String getProvince()
	{
		return province;
	}

	public void setProvince(String province)
	{
		this.province = province;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}
	
	public String getUniversity() 
	{
		return university;
	}

	public void setUniversity(String university) 
	{
		this.university = university;
	}

	public String getHighSchool() 
	{
		return highSchool;
	}

	public void setHighSchool(String highSchool) 
	{
		this.highSchool = highSchool;
	}

	public String getSecondarySchool() 
	{
		return secondarySchool;
	}

	public void setSecondarySchool(String secondarySchool) 
	{
		this.secondarySchool = secondarySchool;
	}

	public String getPrimarySchool() 
	{
		return primarySchool;
	}

	public void setPrimarySchool(String primarySchool)
	{
		this.primarySchool = primarySchool;
	}
}