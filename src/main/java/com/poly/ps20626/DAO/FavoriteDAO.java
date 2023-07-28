package com.poly.ps20626.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.poly.ps20626.Until.*;
import com.poly.ps20626.DAO.ITF.*;
import com.poly.ps20626.Entity.*;
public class FavoriteDAO extends AbstractDAO<Favorite> implements FavoriteDAOITF{

	

	@Override
	public Favorite create(Favorite entity) {
		return super.create(entity);
	}

	@Override
	public Favorite update(Favorite entity) {
		return super.update(entity);
	}

	@Override
	public Favorite delete(Favorite entity) {
		return super.delete(entity);
	}

	@Override
	public List<Favorite> findByUser(String userName) {
		String sql = "SELECT o FROM Favorite o WHERE o.user.email = ?0 AND o.video.active = 1"
				+ " ORDER BY o.FavoriteDate DECS";
		return super.findMany(Favorite.class, sql, userName);
	}

	@Override
	public List<Favorite> findByUserAndIsFavorite(String userName) {
		String sql = "SELECT o FROM Favorite o WHERE o.user.email = ?0 AND o.isLiked = 1"
				+ " ORDER BY o.likeDate DESC";
		return super.findMany(Favorite.class, sql, userName);
	}

	@Override
	public Favorite findByUserIDAndVideoID(Integer userID, Integer videoID) {
		String sql = "SELECT o FROM Favorite o WHERE o.user.id = ?0 AND o.video.id = ?1";
		return super.findOne(Favorite.class, sql, userID,videoID);
	}

	@Override
	public List<Favorite> findAll() {
		return super.findAll(Favorite.class, false);
	}

}
