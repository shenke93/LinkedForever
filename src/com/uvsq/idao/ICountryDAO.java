package com.uvsq.idao;

import java.util.List;

import com.uvsq.domain.Country;

public interface ICountryDAO extends IBasicDAO 
{
	public Country getCountryByName(String name);
	public Country getCountryById(int id);
	public List<Country> showCountryList();
}