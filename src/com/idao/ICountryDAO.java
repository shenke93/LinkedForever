package com.idao;

import java.util.List;

import com.domain.Country;

public interface ICountryDAO extends IBasicDAO 
{
	public Country getCountryById(int id);
	public List<Country> showCountryList();
}