package com.uvsq.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.uvsq.idao.IBasicDAO;

@Transactional
public abstract class BasicDAO implements IBasicDAO 
{
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) 
	{
		this.sessionFactory = sessionFactory;
	}
	
	public void add(Object o) 
	{
		sessionFactory.getCurrentSession().save(o);
	}

	public void delete(Class<?> clazz, int id) 
	{
		sessionFactory.getCurrentSession().delete(this.findById(clazz, id));
	}

	public void update(Object o) 
	{
		sessionFactory.getCurrentSession().update(o);
	}

	public List<Object> executeQuery(String hql, Object[] parameters) 
	{
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		if(parameters != null && parameters.length > 0)
		{
			for(int i=0; i<parameters.length; i++)
			{
				query.setParameter(i, parameters[i]);
			}
		}
		
		return query.list();
	}

	public Object findById(Class<?> clazz, int id)
	{
		return sessionFactory.getCurrentSession().get(clazz, id);
	}

	public Object uniqueQuery(String hql, Object[] parameters)
	{
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		if(parameters != null && parameters.length > 0)
		{
			for(int i=0; i<parameters.length; i++)
			{
				query.setParameter(i, parameters[i]);
			}
		}
		
		return query.uniqueResult();
	}
}