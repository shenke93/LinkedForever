package com.uvsq.idao;

import java.util.List;

import com.uvsq.domain.Province;

public interface IProvinceDAO extends IBasicDAO 
{
	public Province getProByName(String name);
	public Province getProById(int id);
	public List<Province> showProvinceList();
}