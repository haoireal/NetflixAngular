package com.poly.ps20626.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.poly.ps20626.Until.*;
import com.poly.ps20626.DAO.ITF.*;
import com.poly.ps20626.Entity.*;
public class GenresDAO extends AbstractDAO<Genres> implements GenresDAOITF{

	

	@Override
	public Genres create(Genres entity) {
		return super.create(entity);
	}

	@Override
	public Genres update(Genres entity) {
		return super.update(entity);
	}

	@Override
	public Genres delete(Genres entity) {
		return super.delete(entity);
	}

	@Override
	public List<Genres> findAll() {
		// TODO Auto-generated method stub
		return super.findAll(Genres.class, false);
	}

}
