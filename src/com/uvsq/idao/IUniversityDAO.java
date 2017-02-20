package com.uvsq.idao;

import java.util.List;

import com.uvsq.domain.University;

public interface IUniversityDAO extends IBasicDAO 
{
	public University getUniByName(String name);
	public University getUniById(int id);
	public List<University> showUniversityList();
}