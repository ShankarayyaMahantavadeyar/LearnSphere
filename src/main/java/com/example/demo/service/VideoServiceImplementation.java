package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Video;
import com.example.demo.repository.VideoRepository;

@Service
public class VideoServiceImplementation implements VideoService
{
	@Autowired
	VideoRepository repo;

	@Override
	public boolean videoExists(String name) 
	{

		Video video=repo.findByName(name);

		if(video==null)
		{
			return false;
		}
		else
		{
			return true;
		}	
	}
	@Override
	public List<Video> fetchAllVideos() 
	{
		return repo.findAll();
	}

	@Override
	public void addVideo(Video video) 
	{
		
		repo.save(video);	
	}
}
