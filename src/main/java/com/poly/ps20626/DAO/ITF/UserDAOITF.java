package com.poly.ps20626.DAO.ITF;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.Map;

import com.poly.ps20626.Entity.Users;

public interface UserDAOITF {
	Users findByID(Integer id);
	Users findByEmail(String email);
	Users findByFullname(String fullname);
	Users findByEmailandPassWord(String email, String password);
	List<Users> findAll();
	List<Users> findUsersLikedByVideoHref(Map<String, Object> params);
	List<Users> findAll(int pageNumber,int pageSize);
	Users create(Users entity);
	Users update(Users entity);
	Users delete(Users entity);

}
