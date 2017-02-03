package com.domain;

import java.util.Set;

public class University {
	private Integer id;
	private String name;
	private City city;
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
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Set<StuUniversity> getStuUniversities() {
		return stuUniversities;
	}
	public void setStuUniversities(Set<StuUniversity> stuUniversities) {
		this.stuUniversities = stuUniversities;
	}
	
	
}
