package com.idao;

import java.util.List;

import com.domain.Student;

public interface IStudentDAO extends IBasicDAO {
	Student checkStu(Student s);
	List<Student> showStudentList();
	Student getStuById(int id);
}
