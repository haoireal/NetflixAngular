package com.poly.ps20626.serviceITF;

import java.util.List;

import com.poly.ps20626.Entity.Video;

public interface VideoServiceITF {
	Video findByID(Integer id);
	Video findByHref(String href);
	List<Video> findByGenres(String genres);
	List<Video> findByKeyWord(String key);
	List<Video> findAll();
	List<Video> findAll(int pageNumber,int pageSize);
	Video create(Video entity);
	Video update(Video entity);
	Video delete(String href);
}
