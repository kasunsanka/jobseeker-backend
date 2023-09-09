package com.icbt.appoiment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icbt.appoiment.entity.SeekerDetail;
import com.icbt.appoiment.entity.User;
import com.icbt.appoiment.service.UserService;

@RestController
@RequestMapping("/userservice")
public class UserController {
	@Autowired
	private UserService userService;

	    

	    @PostMapping("/register")
	     public User createBook(@RequestBody User user){
	    	return userService.createUser(user);
	    	
	    		
	    	}
	    
	    @GetMapping("/list")
	    public List<User> fetchSeekerDetailList()
	    {
	        return userService.fetchUserList();
    }
	       

	    	
	    }
	
	
	
	
