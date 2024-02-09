package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Video;

public interface VideoService 
{

	public boolean videoExists(String name);
	
	public List<Video> fetchAllVideos();

	public void addVideo(Video video);

	

}
