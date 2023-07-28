package com.poly.ps20626.service;

import java.util.List;

import com.poly.ps20626.DAO.ShareDAO;
import com.poly.ps20626.DAO.ITF.SharesDAOITF;
import com.poly.ps20626.Entity.Share;
import com.poly.ps20626.Entity.Video;
import com.poly.ps20626.serviceITF.ShareServiceITF;
import com.poly.ps20626.serviceITF.VideoServiceITF;

public class ShareService implements ShareServiceITF{
	private SharesDAOITF dao;
	
	public ShareService() {
		dao = new ShareDAO();
	}

	@Override
	public List<Share> findByUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Share> findByUserAndIsShare(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Share findByUserIDAndVideoID(Integer userID, Integer videoID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Share create(Share entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Share update(Share entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Share delete(Share entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Share> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	
	
}
