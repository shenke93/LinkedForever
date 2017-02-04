package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.domain.Province;
import com.idao.IProvinceDAO;

public class ProvinceDAO extends BasicDAO implements IProvinceDAO 
{
	public Province getProById(int id) 
	{
		String hql = "from Province where id=:id";
		Object[] parameters = {id};
		String[] parameters_name = {"id"};
		
		return (Province) this.uniqueQuery(hql, parameters, parameters_name);
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