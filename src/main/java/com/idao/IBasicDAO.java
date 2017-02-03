package com.idao;

import java.util.List;

public interface IBasicDAO {
	void add(Object o);
	void delete(Class<?> clazz, int id);
	void update(Object o);
	List<Object> executeQuery(String hql, Object[] parameters);
	Object findById(Class<?> clazz, int id);
	Object uniqueQuery(String hql, Object[] parameters);
}
