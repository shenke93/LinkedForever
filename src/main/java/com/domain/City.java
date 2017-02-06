package com.domain;

import java.util.Set;

public class City {
	private Integer id;
	private String name;
	private Province province;
	private Set<University> universities;
	private Set<PrimarySchool> primarySchools;
	private Set<JuniorSchool> juniorSchools;
	private Set<SeniorSchool> seniorSchools;
	private Set<Student> students;
	
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
	public Province getProvince() {
		return province;
	}
	public void setProvince(Province province) {
		this.province = province;
	}
	public Set<University> getUniversities() {
		return universities;
	}
	public void setUniversities(Set<University> universities) {
		this.universities = universities;
	}
	public Set<PrimarySchool> getPrimarySchools() {
		return primarySchools;
	}
	public void setPrimarySchools(Set<PrimarySchool> primarySchools) {
		this.primarySchools = primarySchools;
	}
	public Set<JuniorSchool> getJuniorSchools() {
		return juniorSchools;
	}
	public void setJuniorSchools(Set<JuniorSchool> juniorSchools) {
		this.juniorSchools = juniorSchools;
	}
	public Set<SeniorSchool> getSeniorSchools() {
		return seniorSchools;
	}
	public void setSeniorSchools(Set<SeniorSchool> seniorSchools) {
		this.seniorSchools = seniorSchools;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
}
