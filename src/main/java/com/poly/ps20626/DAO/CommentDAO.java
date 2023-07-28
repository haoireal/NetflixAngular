package com.poly.ps20626.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.poly.ps20626.Until.*;
import com.poly.ps20626.DAO.ITF.*;
import com.poly.ps20626.Entity.*;
public class CommentDAO extends AbstractDAO<Comment> implements CommentDAOITF{

	
	@Override
	public Comment create(Comment entity) {
		return super.create(entity);
	}

	@Override
	public Comment update(Comment entity) {
		return super.update(entity);
	}

	@Override
	public Comment delete(Comment entity) {
		return super.delete(entity);
	}

	@Override
	public List<Comment> findAll() {
		return super.findAll(Comment.class, false);
	}

	@Override
	public List<Comment> findByUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> findByUserAndIsComment(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment findByUserIDAndVideoID(Integer userID, Integer videoID) {
		// TODO Auto-generated method stub
		return null;
	}

}
