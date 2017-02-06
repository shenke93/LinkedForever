package com.idao;

import java.util.List;

import com.domain.Country;

public interface ICountryDAO extends IBasicDAO {
	Country getCountryById(int id);
	List<Country> showCountryList();
}
