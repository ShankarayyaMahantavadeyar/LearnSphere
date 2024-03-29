package com.example.demo.entity;

import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Playlist 
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	int id;
	String name;
	@ManyToMany
	List<Video> video;

	public Playlist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Playlist(int id, String name, List<Video> video) {
		super();
		this.id = id;
		this.name = name;
		this.video = video;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Video> getVideo() {
		return video;
	}

	public void setVideo(List<Video> video) {
		this.video = video;
	}

	@Override
	public String toString() {
		return "Playlist [id=" + id + ", name=" + name + ", video=" + video + "]";
	}

	
	
	

}
