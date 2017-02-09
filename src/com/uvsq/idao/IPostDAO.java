package com.uvsq.idao;

import java.util.List;

import com.uvsq.domain.Post;
import com.uvsq.domain.Student;

public interface IPostDAO extends IBasicDAO
{
	public List<Post> showPostList(Student s);
}