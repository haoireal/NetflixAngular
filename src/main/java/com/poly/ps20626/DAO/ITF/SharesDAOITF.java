package com.poly.ps20626.DAO.ITF;

import java.util.List;

import com.poly.ps20626.Entity.*;

public interface SharesDAOITF {
	List<Share> findByUser(String userName);
	List<Share> findByUserAndIsShare(String userName);
	Share findByUserIDAndVideoID(Integer userID,Integer videoID);
	Share create(Share entity);
	Share update(Share entity);
	Share delete(Share entity);
	List<Share> findAll();
}
