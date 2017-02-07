package com.idao;

import java.util.List;

import com.domain.University;

public interface IUniversityDAO extends IBasicDAO 
{
	public University getUniById(int id);
	public List<University> showUniversityList();
}