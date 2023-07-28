package com.poly.ps20626.Entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Genres")
public class Genres {
    @Id
    @Column(name = "Id")
    private String id;
    
    @Column(name = "GenresName")
    private String genresName;
    
    @OneToMany(mappedBy = "genres")
    private List<Video> videos;
    // Getters and Setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGenresName() {
		return genresName;
	}

	public void setGenresName(String genresName) {
		this.genresName = genresName;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}
    
    
}