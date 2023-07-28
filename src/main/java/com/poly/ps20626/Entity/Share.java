package com.poly.ps20626.Entity;

import javax.persistence.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;

@Entity
@Table(name = "Share")
public class Share {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;

//    @ManyToOne(cascade = CascadeType.MERGE)
//    @JoinColumn(name = "UserId",referencedColumnName = "id")
//    @JsonIgnoreProperties(value = {"applications","hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UserId")
	private Users user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VideoId")
	private Video video;

	@Column(name = "Emails")
	private String emails;

	@Column(name = "ShareDate")
	private Date shareDate;
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

	public String getEmails() {
		return emails;
	}

	public void setEmails(String emails) {
		this.emails = emails;
	}

	public Date getShareDate() {
		return shareDate;
	}

	public void setShareDate(Date shareDate) {
		this.shareDate = shareDate;
	}

}