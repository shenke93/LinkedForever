package com.uvsq.myapp.data;

import java.util.List;

import com.uvsq.myapp.Spittle;

public interface SpittleRepository {
	List<Spittle> findSpittles(long max, int count);
	Spittle findOne(long id);
	void save(Spittle spittle);
	List<Spittle> findRecentSpittles();
}
