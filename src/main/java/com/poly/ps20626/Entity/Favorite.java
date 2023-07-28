package com.poly.ps20626.Entity;

import javax.persistence.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;

@Entity
@Table(name = "Favorite")
public class Favorite {
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
	
   

	@Column(name = "isLiked")
    private boolean isLiked;
    
	@Column(name = "LikeDate")
	private Timestamp likeDate;
	// Getters and Setters

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

	public Timestamp getLikeDate() {
		return likeDate;
	}

	public void setLikeDate(Timestamp timestamp) {
		this.likeDate = timestamp;
	}
	 public boolean isLiked() {
			return isLiked;
		}

		public void setLiked(boolean isLiked) {
			this.isLiked = isLiked;
		}
	
}
