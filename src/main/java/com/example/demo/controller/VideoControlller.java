package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Video;
import com.example.demo.service.VideoService;


@Controller
public class VideoControlller 
{
	@Autowired
	VideoService service;

	@PostMapping("/addVideo")
	public String addVideo(@ModelAttribute Video video)
	{
		boolean videoStatus=service.videoExists(video.getName());
		if(videoStatus==false)
		{
		service.addVideo(video);
		System.out.println("Video added Sucessfully");
		}
		else 
		{
			System.out.println("Video already Exists");
		}
		return "admin";
	}
	@GetMapping("/viewvideo")
	public String viewvideo(Model model)
	{
	  List <Video> videosList=service.fetchAllVideos();	
	  model.addAttribute("video", videosList);
	  System.out.println(videosList);
	  
	  return "displayVideos";	
	}
}
