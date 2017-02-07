package com.idao;

import java.util.List;

import com.domain.City;

public interface ICityDAO extends IBasicDAO 
{
	public City getCityById(int id);
	public List<City> showCityList();
}