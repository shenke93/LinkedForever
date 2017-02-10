package com.uvsq.factory;

import com.uvsq.dao.CityDAO;
import com.uvsq.dao.CommentDAO;
import com.uvsq.dao.CountryDAO;
import com.uvsq.dao.FriendshipDAO;
import com.uvsq.dao.PostDAO;
import com.uvsq.dao.ProvinceDAO;
import com.uvsq.dao.StudentDAO;
import com.uvsq.dao.UniversityDAO;
import com.uvsq.idao.ICityDAO;
import com.uvsq.idao.ICommentDAO;
import com.uvsq.idao.ICountryDAO;
import com.uvsq.idao.IFriendshipDAO;
import com.uvsq.idao.IPostDAO;
import com.uvsq.idao.IProvinceDAO;
import com.uvsq.idao.IStudentDAO;
import com.uvsq.idao.IUniversityDAO;

public class DaoFactory 
{
	public static final IStudentDAO getStudentDAO()
	{
		return new StudentDAO();
	}
	
	public static final ICountryDAO getCountryDAO()
	{
		return new CountryDAO();
	}
	
	public static final IProvinceDAO getProvinceDAO()
	{
		return new ProvinceDAO();
	}
	
	public static final ICityDAO getCityDAO()
	{
		return new CityDAO();
	}
	
	public static final IUniversityDAO getUniversityDAO()
	{
		return new UniversityDAO();
	}
	
	public static final IFriendshipDAO getFriendshipDAO()
	{
		return new FriendshipDAO();
	}
	
	public static final IPostDAO getPostDAO()
	{
		return new PostDAO();
	}
	
	public static final ICommentDAO getCommentDAO()
	{
		return new CommentDAO();
	}
}