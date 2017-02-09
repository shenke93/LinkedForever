package com.uvsq.idao;

import java.util.List;

import com.uvsq.domain.City;

public interface ICityDAO extends IBasicDAO 
{
	public City getCityByName(String name);
	public City getCityById(int id);
	public List<City> showCityList();
}