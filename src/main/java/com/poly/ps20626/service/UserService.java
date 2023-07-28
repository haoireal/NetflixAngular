package com.poly.ps20626.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.poly.ps20626.DAO.UserDAO;
import com.poly.ps20626.DAO.VideoDAO;
import com.poly.ps20626.DAO.ITF.UserDAOITF;
import com.poly.ps20626.DAO.ITF.VideoDAOITF;
import com.poly.ps20626.Entity.Users;
import com.poly.ps20626.Entity.Video;
import com.poly.ps20626.serviceITF.UserServiceITF;
import com.poly.ps20626.serviceITF.VideoServiceITF;

public class UserService implements UserServiceITF{
	
	private UserDAOITF dao;
	
	public UserService() {
		dao = new UserDAO();
	}
	
	@Override
	public Users findByID(Integer id) {
		// TODO Auto-generated method stub
		return dao.findByID(id);
	}

	@Override
	public Users findByEmail(String email) {
		// TODO Auto-generated method stub
		return dao.findByEmail(email);
	}

	@Override
	public Users findByFullname(String fullname) {
		// TODO Auto-generated method stub
		return dao.findByFullname(fullname);
	}

	@Override
	public Users Login(String email, String password) {
		// TODO Auto-generated method stub
		return dao.findByEmailandPassWord(email, password);
	}

	@Override
	public Users resetPassword(String email) {
		
		return null;
	}

	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Users> findAll(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return dao.findAll(pageNumber, pageSize);
	}

	@Override
	public Users create(String email, String password, String fullname) {
		Users newUser = new Users();
		newUser.setEmail(email);
		newUser.setPassword(password);
		newUser.setFullname(fullname);
		
		newUser.setAdmin(Boolean.FALSE);
		// Generate a random verification code
		Random random = new Random();
		int vericode = random.nextInt(90000) + 10000;
		newUser.setVericode(vericode);
		
		newUser.setIsveri(Boolean.FALSE);
		
		return dao.create(newUser);
	}

	@Override
	public Users update(Users entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public Users delete(String email) {
		Users user = dao.findByEmail(email);
		user.setIsveri(Boolean.FALSE);
		return dao.update(user);
	}

	@Override
	public List<Users> findUsersLikedVideoByVideoHref(String href) {
		Map<String, Object> params = new HashMap<>();
		params.put("videoHref", href);
		return dao.findUsersLikedByVideoHref(params);
	}

	

}
