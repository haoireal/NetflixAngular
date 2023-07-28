package com.poly.ps20626.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.poly.ps20626.Until.*;
import com.poly.ps20626.DAO.ITF.*;
import com.poly.ps20626.Entity.*;
public class ShareDAO extends AbstractDAO<Share> implements SharesDAOITF{

	@Override
	public List<Share> findByUser(String userName) {
		String sql = "SELECT o FROM Share o WHERE o.user.email = ?0 AND o.video.Active = 1"
				+ " ORDER BY o.shareDate DECS";
		return super.findMany(Share.class, sql, userName);
	}

	@Override
	public List<Share> findByUserAndIsShare(String userName) {
		String sql = "SELECT o FROM Share o WHERE o.user.email = ?0 AND o.IsShare = 1"
				+ " AND o.video.Active = 1"
				+ " ORDER BY o.shareDate DECS";
		return super.findMany(Share.class, sql, userName);
	}

	@Override
	public Share findByUserIDAndVideoID(Integer userID, Integer videoID) {
		String sql = "SELECT o FROM Share o WHERE o.user.UserId = ?0 AND o.video.VideoID = ?1"
				+ " AND o.video.Active = 1";
		return super.findOne(Share.class, sql, userID,videoID);
	}

	@Override
	public Share create(Share entity) {
		return super.create(entity);
	}

	@Override
	public Share update(Share entity) {
		return super.update(entity);
	}

	@Override
	public Share delete(Share entity) {
		return super.delete(entity);
	}

	@Override
	public List<Share> findAll() {
		// TODO Auto-generated method stub
		return super.findAll(Share.class, false);
	}

}
