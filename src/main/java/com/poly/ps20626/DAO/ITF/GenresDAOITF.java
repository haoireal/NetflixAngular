package com.poly.ps20626.DAO.ITF;

import java.util.List;

import com.poly.ps20626.Entity.*;

public interface GenresDAOITF {
	List<Genres> findAll();

	Genres create(Genres entity);

	Genres update(Genres entity);

	Genres delete(Genres entity);
}
