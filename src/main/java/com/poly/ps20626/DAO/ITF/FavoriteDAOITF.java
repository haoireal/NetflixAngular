package com.poly.ps20626.DAO.ITF;

import java.util.List;

import com.poly.ps20626.Entity.*;

public interface FavoriteDAOITF {
	List<Favorite> findAll();
	List<Favorite> findByUser(String userName);
	List<Favorite> findByUserAndIsFavorite(String userName);
	Favorite findByUserIDAndVideoID(Integer userID,Integer videoID);
	Favorite create(Favorite entity);
	Favorite update(Favorite entity);
	Favorite delete(Favorite entity);
}
