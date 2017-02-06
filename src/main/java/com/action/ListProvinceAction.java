package com.action;

import java.util.List;

import com.domain.Province;
import com.idao.IProvinceDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ListProvinceAction extends ActionSupport {
	private IProvinceDAO iProvinceDAO;
	private List<Province> listProvince;
	
	public List<Province> getList() {
		return listProvince;
	}
	public void setiProvinceDAO(IProvinceDAO iProvinceDAO) {
		this.iProvinceDAO = iProvinceDAO;
	}
	
	public String execute() throws Exception {
		listProvince = iProvinceDAO.showProvinceList();
		return SUCCESS;
	}	
}
