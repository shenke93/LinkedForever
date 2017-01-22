package com.yunkai.service;

import java.util.ArrayList;
import java.util.List;

import com.yunkai.dao.HibernateUtil;
import com.yunkai.domain.City;

public class CityService 
{
	private HibernateUtil hibernateUtil;

	public void setHibernateUtil(HibernateUtil hibernateUtil) 
	{
		this.hibernateUtil = hibernateUtil;
	}
	
	public void addCity(City c)
	{
		hibernateUtil.add(c);
	}
	
	public void deleteCity(int id)
	{
		hibernateUtil.delete(City.class, id);
	}
	
	public void updateCity(City c)
	{
		hibernateUtil.update(c);
	}
	
	public City getCityById(int id)
	{
		String hql = "from City where id=?";
		Object[] parameters = {id};
		
		return (City) hibernateUtil.uniqueQuery(hql, parameters);
	}
	
	public List<City> showAllCity()
	{
		String hql = "from Student";
		
		List<Object> l1 = (List<Object>) hibernateUtil.executeQuery(hql, null);
		
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