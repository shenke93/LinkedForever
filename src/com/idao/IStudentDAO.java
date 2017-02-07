package com.idao;

import java.util.List;

import com.domain.Student;

public interface IStudentDAO extends IBasicDAO
{
	public Student checkStuByEmail(Student s);
	public Student checkStuByPhone(Student s);
	public List<Student> showStudentList();
	public Student getStuById(int id);
}