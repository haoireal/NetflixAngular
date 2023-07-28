package com.poly.ps20626.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Video")
public class Video {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;
	
	@Column(name = "Title")
	private String title;

	@Column(name = "href")
	private String href;
	
	@Column(name = "Poster")
	private String poster;
	
	@Column(name = "Viewss")
	private Integer views;
	
	@Column(name = "Shares")
	private Integer Shares;

	@Column(name = "Description")
	private String description;

	@Column(name = "Active")
	private Boolean active;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GenresID")
	private Genres genres;

	@OneToMany(mappedBy = "video")
	private List<Favorite> favorites;

	@OneToMany(mappedBy = "video")
	private List<Share> shares;

	@OneToMany(mappedBy = "video")
	private List<Comment> comments;



	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public void setShares(Integer shares) {
		Shares = shares;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Genres getGenres() {
		return genres;
	}

	public void setGenres(Genres genres) {
		this.genres = genres;
	}

	public List<Favorite> getFavorites() {
		return favorites;
	}

	public void setFavorites(List<Favorite> favorites) {
		this.favorites = favorites;
	}

	public List<Share> getShares() {
		return shares;
	}

	public void setShares(List<Share> shares) {
		this.shares = shares;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	// Getters and Setters

}
