package com.poly.ps20626.DAO;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.poly.ps20626.Until.*;
import com.poly.ps20626.Constant.nameStored;
import com.poly.ps20626.DAO.ITF.UserDAOITF;
import com.poly.ps20626.Entity.*;

public class UserDAO extends AbstractDAO<Users> implements UserDAOITF{

	@Override
	public Users findByID(Integer id) {
		return super.findById(Users.class, id);
	}

	@Override
	public Users findByEmail(String email) {
		String sql = "SELECT o FROM Users o WHERE o.email = ?0";
		return super.findOne(Users.class, sql, email);
	}

	@Override
	public Users findByFullname(String fullname) {
		String sql = "SELECT o FROM Users o WHERE o.FullName = ?0";
		return super.findOne(Users.class, sql, fullname);
	}

	@Override
	public Users findByEmailandPassWord(String email, String password) {
		String sql = "SELECT o FROM Users o WHERE o.email = ?0 AND o.password = ?1";
		return super.findOne(Users.class, sql, email,password);
	}

	@Override
	public List<Users> findAll() {
		return super.findAll(Users.class, false);
	}

	@Override
	public List<Users> findAll(int pageNumber, int pageSize) {
		return super.findAll(Users.class, false,pageNumber,pageSize);
	}
	
	@Override
	public Users create(Users entity) {
		return super.create(entity);
	}

	@Override
	public Users update(Users entity) {
		return super.update(entity);
	}

	@Override
	public Users delete(Users entity) {
		return super.delete(entity);
	}

	@Override
	public List<Users> findUsersLikedByVideoHref(Map<String, Object> params) {
		
		return super.callStored(nameStored.STORED_FIND_USER_LIKED_BY_VIDEO, params);
	}

	
	
}
