package com.factory;

import com.dao.CityDAO;
import com.dao.CountryDAO;
import com.dao.ProvinceDAO;
import com.dao.StudentDAO;
import com.dao.UniversityDAO;
import com.idao.ICityDAO;
import com.idao.ICountryDAO;
import com.idao.IProvinceDAO;
import com.idao.IStudentDAO;
import com.idao.IUniversityDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class DaoFactory {
    public static final IStudentDAO getStudentDAO()
    {
        return new StudentDAO();
    }

	public static final ICountryDAO getCountryDAO()
	{
		return new CountryDAO();
	}

	public static final IProvinceDAO getProvinceDAO()
	{
		return new ProvinceDAO();
	}

	public static final ICityDAO getCityDAO()
	{
		return new CityDAO();
	}

	public static final IUniversityDAO getUniversityDAO()
	{
		return new UniversityDAO();
	}
}
