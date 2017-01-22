package com.yunkai.service;

import java.util.ArrayList;
import java.util.List;

import com.yunkai.dao.HibernateUtil;
import com.yunkai.domain.Country;

public class CountryService 
{
	private HibernateUtil hibernateUtil;

	public void setHibernateUtil(HibernateUtil hibernateUtil) 
	{
		this.hibernateUtil = hibernateUtil;
	}
	
	public void addCountry(Country c)
	{
		hibernateUtil.add(c);
	}
	
	public void deleteCountry(int id)
	{
		hibernateUtil.delete(Country.class, id);
	}
	
	public void updateCountry(Country c)
	{
		hibernateUtil.update(c);
	}
	
	public Country getCountryById(int id)
	{
		String hql = "from Country where id=?";
		Object[] parameters = {id};
		
		return (Country) hibernateUtil.uniqueQuery(hql, parameters);
	}
	
	public List<Country> showAllCountry()
	{
		String hql = "from Country";
		
		List<Object> l1 = (List<Object>) hibernateUtil.executeQuery(hql, null);
		
		if(l1.size() == 0)
		{
			return null;
		}
		else
		{
			List<Country> l2 = new ArrayList<Country>();
			
			for(Object o : l1)
			{
				l2.add((Country) o);
			}
			
			return l2;
		}
	}
}