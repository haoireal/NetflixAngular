package com.poly.ps20626.service;

import java.util.List;

import com.poly.ps20626.DAO.VideoDAO;
import com.poly.ps20626.DAO.ITF.VideoDAOITF;
import com.poly.ps20626.Entity.Video;
import com.poly.ps20626.serviceITF.VideoServiceITF;

public class VideoService implements VideoServiceITF{

	private VideoDAOITF dao;
	
	public VideoService() {
		dao = new VideoDAO();
	}
	
	@Override
	public Video findByID(Integer id) {
		return dao.findByID(id);
	}

	@Override
	public Video findByHref(String href) {
		
		return dao.findByHref(href);
	}

	@Override
	public List<Video> findByGenres(String genres) {
		
		return dao.findByGenres(genres);
	}

	@Override
	public List<Video> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Video> findAll(int pageNumber, int pageSize) {
		
		return dao.findAll(pageNumber, pageSize);
	}

	@Override
	public Video create(Video entity) {
		entity.setActive(true);
		entity.setViews(0);
		entity.setShares(0);
		
		return dao.create(entity);
	}

	@Override
	public Video update(Video entity) {
		return dao.update(entity);
	}

	@Override
	public Video delete(String href) {
		Video entity =  dao.findByHref(href);
		entity.setActive(Boolean.FALSE);
		return dao.update(entity);
	}

	@Override
	public List<Video> findByKeyWord(String key) {
		
		return dao.findByKeyWord(key);
	}

}
