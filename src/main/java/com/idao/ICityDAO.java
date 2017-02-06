package com.idao;

import java.util.List;

import com.domain.City;

public interface ICityDAO extends IBasicDAO {
	City getCityById(int id);
	List<City> showCityList();
}
