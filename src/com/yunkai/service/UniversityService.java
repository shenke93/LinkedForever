package com.yunkai.service;

import java.util.ArrayList;
import java.util.List;

import com.yunkai.dao.HibernateUtil;
import com.yunkai.domain.University;

public class UniversityService 
{
	private HibernateUtil hibernateUtil;

	public void setHibernateUtil(HibernateUtil hibernateUtil) 
	{
		this.hibernateUtil = hibernateUtil;
	}
	
	public void addUni(University u)
	{
		hibernateUtil.add(u);
	}
	
	public void deleteUni(int id)
	{
		hibernateUtil.delete(University.class, id);
	}
	
	public void updateUni(University u)
	{
		hibernateUtil.update(u);
	}
	
	public University getUniById(int id)
	{
		String hql = "from University where id=?";
		Object[] parameters = {id};
		
		return (University) hibernateUtil.uniqueQuery(hql, parameters);
	}
	
	public List<University> showAllUni()
	{
		String hql = "from University";
		
		List<Object> l1 = (List<Object>) hibernateUtil.executeQuery(hql, null);
		
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