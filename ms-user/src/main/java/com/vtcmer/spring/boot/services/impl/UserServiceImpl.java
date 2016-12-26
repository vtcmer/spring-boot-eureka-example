package com.vtcmer.spring.boot.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtcmer.spring.boot.model.User;
import com.vtcmer.spring.boot.repository.UserRepository;
import com.vtcmer.spring.boot.services.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User getUser(String userName) {
		
		return this.userRepository.getUser(userName);
	}
	
	

}
