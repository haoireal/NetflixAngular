package com.poly.ps20626.serviceITF;

import java.util.List;

import com.poly.ps20626.Entity.Users;

public interface UserServiceITF {
	Users findByID(Integer id);
	Users findByEmail(String email);
	Users findByFullname(String fullname);
	Users Login(String email, String password);
	Users resetPassword(String email);
	List<Users> findAll();
	List<Users> findAll(int pageNumber,int pageSize);
	Users create(String email, String password, String fullname);
	Users update(Users entity);
	Users delete(String email);
	List<Users> findUsersLikedVideoByVideoHref(String href);
}
