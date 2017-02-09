package com.uvsq.dao;

import java.util.ArrayList;
import java.util.List;

import com.uvsq.domain.Province;
import com.uvsq.idao.IProvinceDAO;

public class ProvinceDAO extends BasicDAO implements IProvinceDAO 
{
	public Province getProById(int id) 
	{
		String hql = "from Province where id=?";
		Object[] parameters = {id};
		
		return (Province) this.uniqueQuery(hql, parameters);
	}
	
	public Province getProByName(String name) 
	{
		String hql = "from Province where name=?";
		Object[] parameters = {name};
		
		return (Province) this.uniqueQuery(hql, parameters);
	}

	public List<Province> showProvinceList() 
	{
		String hql = "from Province";
		
		List<Object> l1 = (List<Object>) this.executeQuery(hql, null);
		
		if(l1.size() == 0)
		{
			return null;
		}
		else
		{
			List<Province> l2 = new ArrayList<Province>();
			
			for(Object o : l1)
			{
				l2.add((Province) o);
			}
			
			return l2;
		}
	}
}