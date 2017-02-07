package com.idao;

import java.util.List;

import com.domain.Province;

public interface IProvinceDAO extends IBasicDAO 
{
	public Province getProById(int id);
	public List<Province> showProvinceList();
}