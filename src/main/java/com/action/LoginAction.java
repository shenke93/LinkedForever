package com.action;

import com.domain.Student;
import com.idao.IStudentDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private IStudentDAO iStudentDAO;
	private Student student;
	public IStudentDAO getiStudentDAO() {
		return iStudentDAO;
	}
	public void setiStudentDAO(IStudentDAO iStudentDAO) {
		this.iStudentDAO = iStudentDAO;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public String execute() throws Exception {
		if (iStudentDAO.checkStu(student) != null) {
			return SUCCESS;
		}
		return ERROR;
	}
	
	
}
