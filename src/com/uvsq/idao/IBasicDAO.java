package com.uvsq.idao;

import java.util.List;

public interface IBasicDAO 
{
	public void add(Object o);
	public void delete(Class<?> clazz, int id);
	public void update(Object o);
	public List<Object> executeQuery(String hql, Object[] parameters);
	public Object findById(Class<?> clazz, int id);
	public Object uniqueQuery(String hql, Object[] parameters);
}