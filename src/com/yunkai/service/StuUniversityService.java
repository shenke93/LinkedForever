package com.yunkai.service;

import com.yunkai.dao.HibernateUtil;
import com.yunkai.domain.StuUniversity;

public class StuUniversityService 
{
	private HibernateUtil hibernateUtil;

	public void setHibernateUtil(HibernateUtil hibernateUtil) 
	{
		this.hibernateUtil = hibernateUtil;
	}
	
	public void addSU(StuUniversity su)
	{
		hibernateUtil.add(su);
	}
	
	public void deleteSU(int id)
	{
		hibernateUtil.delete(StuUniversity.class, id);
	}
	
	public void updateSU(StuUniversity su)
	{
		hibernateUtil.update(su);
	}
}