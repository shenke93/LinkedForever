package com.uvsq.idao;

import java.util.List;

import com.uvsq.domain.Student;

public interface IFriendshipDAO extends IBasicDAO 
{
	public void makeFriend(Student s1, Student s2);
	public List<Student> showFriendList(Student s);
	public void deleteFriend(Student s1, Student s2);
	public boolean isFriend(Student s1, Student s2);
}