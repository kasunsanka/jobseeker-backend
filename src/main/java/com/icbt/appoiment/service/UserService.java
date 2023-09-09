package com.icbt.appoiment.service;

import java.util.List;

import com.icbt.appoiment.dto.UserDTO;
import com.icbt.appoiment.entity.SeekerDetail;
import com.icbt.appoiment.entity.User;

public interface UserService{
	User createUser(User user);
	
	List<User> fetchUserList();
	
}
