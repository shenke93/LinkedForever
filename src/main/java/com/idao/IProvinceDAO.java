package com.idao;

import java.util.List;

import com.domain.Province;

public interface IProvinceDAO extends IBasicDAO {
	Province getProById(int id);
	List<Province> showProvinceList();
}
