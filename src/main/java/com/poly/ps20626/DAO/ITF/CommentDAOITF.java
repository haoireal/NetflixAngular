package com.poly.ps20626.DAO.ITF;

import java.util.List;

import com.poly.ps20626.Entity.*;

public interface CommentDAOITF {
	List<Comment> findAll();
	List<Comment> findByUser(String userName);
	List<Comment> findByUserAndIsComment(String userName);
	Comment findByUserIDAndVideoID(Integer userID,Integer videoID);
	Comment create(Comment entity);
	Comment update(Comment entity);
	Comment delete(Comment entity);
}
