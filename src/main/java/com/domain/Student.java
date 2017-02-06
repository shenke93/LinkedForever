package com.domain;

import java.util.Set;

public class Student {
	private Integer id;
	private String name;
	private String pwd;
	private String sex;
	private String tel;
	private String email;
	private String birthday;
	private Province homePro;
	private City homeCity;
	private Set<StuUniversity> stuUniversities;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public Province getHomePro() {
		return homePro;
	}
	public void setHomePro(Province homePro) {
		this.homePro = homePro;
	}
	public City getHomeCity() {
		return homeCity;
	}
	public void setHomeCity(City homeCity) {
		this.homeCity = homeCity;
	}
	public Set<StuUniversity> getStuUniversities() {
		return stuUniversities;
	}
	public void setStuUniversities(Set<StuUniversity> stuUniversities) {
		this.stuUniversities = stuUniversities;
	}
	
}
