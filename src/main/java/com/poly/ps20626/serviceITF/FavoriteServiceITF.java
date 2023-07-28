package com.poly.ps20626.serviceITF;

import java.util.List;

import com.poly.ps20626.Entity.*;

public interface FavoriteServiceITF {
	List<Favorite> findAll();
	List<Favorite> findByUser(String userName);
	List<Favorite> findByUserAndIsFavorite(String userName);
	Favorite findByUserIDAndVideoID(Integer userID,Integer videoID);
	Favorite create(Users user, Video video);
	Boolean updateLikeOrUnlike(Users user,String videoHref);

}
