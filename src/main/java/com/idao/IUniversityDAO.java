package com.idao;

import java.util.List;

import com.domain.University;

public interface IUniversityDAO extends IBasicDAO {
	University getUniById(int id);
	List<University> showUniversityList();
}
