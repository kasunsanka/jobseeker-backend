package com.icbt.appoiment.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icbt.appoiment.dto.UserDTO;
import com.icbt.appoiment.entity.SeekerDetail;
import com.icbt.appoiment.entity.User;
import com.icbt.appoiment.repo.UserRepository;
import com.icbt.appoiment.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repo;

	

	public User createUser(User user) {
		  return repo.save(user);
	}



	public List<User> fetchUserList() {
		 return (List<User>)
				 repo.findAll();
	}

	


}
