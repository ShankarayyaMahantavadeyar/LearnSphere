package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Video 
{

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	int id;
	String name;
	String link;
	
	@ManyToMany
	List <Playlist>playlists;

	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Video(int id, String name, String link, List<Playlist> playlists) {
		super();
		this.id = id;
		this.name = name;
		this.link = link;
		this.playlists = playlists;
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

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public List<Playlist> getPlaylists() {
		return playlists;
	}

	public void setPlaylists(List<Playlist> playlists) {
		this.playlists = playlists;
	}

	@Override
	public String toString() {
		return "Video [id=" + id + ", name=" + name + ", link=" + link + ", playlists=" + playlists + "]";
	}
	
}
