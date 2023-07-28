package com.poly.ps20626.Entity;

import javax.persistence.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;

@Entity
@Table(name = "Share")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserId")
    private Users user;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VideoId")
    private Video video;
    
    @Column(name = "CommentContent")
    private String commentcontent;
    
    @Column(name = "CommentDate")
    private Date commentdate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public String getCommentcontent() {
		return commentcontent;
	}

	public void setCommentcontent(String commentcontent) {
		this.commentcontent = commentcontent;
	}

	public Date getCommentdate() {
		return commentdate;
	}

	public void setCommentdate(Date commentdate) {
		this.commentdate = commentdate;
	}
    
    // Getters and Setters
    
}