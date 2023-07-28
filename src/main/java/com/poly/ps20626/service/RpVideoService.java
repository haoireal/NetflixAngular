package com.poly.ps20626.service;

import java.util.ArrayList;
import java.util.List;

import com.poly.ps20626.Entity.VideoLikedInfo;
import com.poly.ps20626.DAO.*;


public class RpVideoService {
	RPVideoDAO  dao;

	public RpVideoService() {
		dao = new RPVideoDAO();
	}
	
	public List<VideoLikedInfo> findVideoLikedInfo(){
		return dao.findVideoLikedInfo();
		
	}
}
