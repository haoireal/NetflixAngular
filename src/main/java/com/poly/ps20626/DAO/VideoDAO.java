package com.poly.ps20626.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.poly.ps20626.Until.*;
import com.poly.ps20626.DAO.ITF.*;
import com.poly.ps20626.Entity.*;
public class VideoDAO extends AbstractDAO<Video> implements VideoDAOITF{

	@Override
	public Video findByID(Integer id) {
		return super.findById(Video.class, id);
	}

	@Override
	public Video findByHref(String href) {
		String sql = "SELECT o FROM Video o WHERE o.href = ?0";
		return super.findOne(Video.class, sql, href);
	}


	@Override
	public List<Video> findByGenres(String genres) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Video> findAll() {
		return super.findAll(Video.class, true);
	}

	@Override
	public List<Video> findAll(int pageNumber, int pageSize) {
		return super.findAll(Video.class, true,pageNumber,pageSize);
	}

	@Override
	public Video create(Video entity) {
		return super.create(entity);
	}

	@Override
	public Video update(Video entity) {
		// TODO Auto-generated method stub
		return super.update(entity);
	}

	@Override
	public Video delete(String entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Video> findByKeyWord(String key) {
		String sql = "SELECT o FROM Video o WHERE o.title LIKE CONCAT('%',?0, '%')";
		return super.findMany(Video.class, sql, key);
	}

}
