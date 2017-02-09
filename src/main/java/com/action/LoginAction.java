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
	
	public String execute() {
		System.out.println("I am runing LoginAction execute function!!!!");
		if (iStudentDAO.checkStu(student) != null) {
			System.out.println("Login success!!!!!!!!!!!");
			return "success";
		}
		System.out.println("Login error!!!!!!!!!!!!!!");
		return "error";
	}
	
	
}
