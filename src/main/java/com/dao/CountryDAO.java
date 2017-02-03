package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.domain.Country;
import com.idao.ICountryDAO;

public class CountryDAO extends BasicDAO implements ICountryDAO 
{
	public Country getCountryById(int id) 
	{
		String hql = "from Country where id=?";
		Object[] parameters = {id};
		
		return (Country) this.uniqueQuery(hql, parameters);
	}

	public List<Country> showCountryList() 
	{
		String hql = "from Country";
		
		List<Object> l1 = (List<Object>) this.executeQuery(hql, null);
		
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