package com.uvsq.idao;

import java.util.List;

import com.uvsq.domain.Student;

public interface IStudentDAO extends IBasicDAO
{
	public Student checkStuByEmail(Student s);
	public List<Student> showStudentList();
	public Student getStuById(int id);
	public List<Student> getStuByName(String name);
}