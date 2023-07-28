package com.poly.ps20626.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Random;

import com.poly.ps20626.DAO.FavoriteDAO;
import com.poly.ps20626.DAO.ITF.FavoriteDAOITF;
import com.poly.ps20626.Entity.Favorite;
import com.poly.ps20626.Entity.Users;
import com.poly.ps20626.Entity.Video;
import com.poly.ps20626.serviceITF.FavoriteServiceITF;
import com.poly.ps20626.serviceITF.VideoServiceITF;


public class FavoriteService implements FavoriteServiceITF{
	
	private FavoriteDAOITF dao;
	private VideoServiceITF videoService = new VideoService();
	
	public FavoriteService() {
		dao = new FavoriteDAO();
	}

	@Override
	public List<Favorite> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Favorite> findByUser(String userName) {
		// TODO Auto-generated method stub
		return dao.findByUser(userName);
	}

	@Override
	public List<Favorite> findByUserAndIsFavorite(String userName) {
		// TODO Auto-generated method stub
		return dao.findByUserAndIsFavorite(userName);
	}

	@Override
	public Favorite findByUserIDAndVideoID(Integer userID, Integer videoID) {
		// TODO Auto-generated method stub
		return dao.findByUserIDAndVideoID(userID, videoID);
	}

	@Override
	public Favorite create(Users user, Video video) {
		Favorite favorite = new Favorite();
		favorite.setUser(user);
		favorite.setVideo(video);
		favorite.setLiked(Boolean.FALSE);
		favorite.setLikeDate(new Timestamp(System.currentTimeMillis()));
		return dao.create(favorite);
	}

	@Override
	public Boolean updateLikeOrUnlike(Users user, String videohref) {
		Video video = videoService.findByHref(videohref); 
		Favorite existFavorite = findByUserIDAndVideoID(user.getId(), video.getId());
		
		if(existFavorite.isLiked() == Boolean.FALSE) {
			existFavorite.setLiked(Boolean.TRUE);
			existFavorite.setLikeDate(new Timestamp(System.currentTimeMillis()));
		}else {
			existFavorite.setLiked(Boolean.FALSE);
			existFavorite.setLikeDate(null);
		}
		Favorite updateFavorite = dao.update(existFavorite);
		return updateFavorite!=null ? Boolean.TRUE : Boolean.FALSE;
	}
	
	

}
