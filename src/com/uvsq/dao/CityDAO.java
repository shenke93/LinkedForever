package com.uvsq.dao;

import java.util.ArrayList;
import java.util.List;

import com.uvsq.domain.City;
import com.uvsq.idao.ICityDAO;

public class CityDAO extends BasicDAO implements ICityDAO 
{
	public City getCityById(int id) 
	{
		String hql = "from City where id=?";
		Object[] parameters = {id};
		
		return (City) this.uniqueQuery(hql, parameters);
	}
	
	public City getCityByName(String name) 
	{
		String hql = "from City where name=?";
		Object[] parameters = {name};
		
		return (City) this.uniqueQuery(hql, parameters);
	}

	public List<City> showCityList() 
	{
		String hql = "from City";
		
		List<Object> l1 = (List<Object>) this.executeQuery(hql, null);
		
		if(l1.size() == 0)
		{
			return null;
		}
		else
		{
			List<City> l2 = new ArrayList<City>();
			
			for(Object o : l1)
			{
				l2.add((City) o);
			}
			
			return l2;
		}
	}
}