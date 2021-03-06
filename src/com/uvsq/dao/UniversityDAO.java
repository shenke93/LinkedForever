package com.uvsq.dao;

import java.util.ArrayList;
import java.util.List;

import com.uvsq.domain.University;
import com.uvsq.idao.IUniversityDAO;

public class UniversityDAO extends BasicDAO implements IUniversityDAO 
{
	public University getUniById(int id) 
	{
		String hql = "from University where id=?";
		Object[] parameters = {id};
		
		return (University) this.uniqueQuery(hql, parameters);
	}
	
	public University getUniByName(String name) 
	{
		String hql = "from University where name=?";
		Object[] parameters = {name};
		
		return (University) this.uniqueQuery(hql, parameters);
	}

	public List<University> showUniversityList() 
	{
		String hql = "from University";
		
		List<Object> l1 = (List<Object>) this.executeQuery(hql, null);
		
		if(l1.size() == 0)
		{
			return null;
		}
		else
		{
			List<University> l2 = new ArrayList<University>();
			
			for(Object o : l1)
			{
				l2.add((University) o);
			}
			
			return l2;
		}
	}
}