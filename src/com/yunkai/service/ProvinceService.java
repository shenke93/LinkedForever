package com.yunkai.service;

import java.util.ArrayList;
import java.util.List;

import com.yunkai.dao.HibernateUtil;
import com.yunkai.domain.Province;

public class ProvinceService
{
	private HibernateUtil hibernateUtil;

	public void setHibernateUtil(HibernateUtil hibernateUtil) 
	{
		this.hibernateUtil = hibernateUtil;
	}
	
	public void addPro(Province p)
	{
		hibernateUtil.add(p);
	}
	
	public void deletePro(int id)
	{
		hibernateUtil.delete(Province.class, id);
	}
	
	public void updatePro(Province s)
	{
		hibernateUtil.update(s);
	}
	
	public Province getProById(int id)
	{
		String hql = "from Province where id=?";
		Object[] parameters = {id};
		
		return (Province) hibernateUtil.uniqueQuery(hql, parameters);
	}
	
	public List<Province> showAllPro()
	{
		String hql = "from Province";
		
		List<Object> l1 = (List<Object>) hibernateUtil.executeQuery(hql, null);
		
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