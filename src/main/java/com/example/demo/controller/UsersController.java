package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Users;
import com.example.demo.service.UsersService;

@Controller
public class UsersController 
{
	@Autowired
	UsersService service;

	@PostMapping("/register")
	public String addUsers(@ModelAttribute Users user)
	{
		boolean userStatus=service.emailExists(user.getEmail());
		if(userStatus == false) 
		{
			service.addUsers(user);
			System.out.println("User Added");

		}
		else
		{
			System.out.println("User already exists");
		}
		return "index";	
	}
	@PostMapping("/validate")
	public String postMethodName(@RequestParam("email") String email,
			@RequestParam("password") String password) 

	{
		if(service.validateUser(email,password) == true)
		{
			String role=service.getRole(email);
			if(role.equals("admin")) 
			{
				return "admin";
			}

			else 
			{
				return "customer";
			}
		}
		return "login";
	}




	@PostMapping("/java")
	public String java()
	{ 
		return "java";    
	}

	@PostMapping("/mysql")
	public String mysql()
	{
		return "mysql";	
	}
	@PostMapping("/frontend")
	public String frontend()
	{
		return "frontend";	
	}
	@PostMapping("/python")
	public String python()
	{
		return "python";	
	}
	@PostMapping("/softskills")
	public String softskills()
	{
		return "softskills";	
	}

}
