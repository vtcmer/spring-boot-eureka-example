package com.vtcmer.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vtcmer.spring.boot.model.User;
import com.vtcmer.spring.boot.services.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/{userName}", method=RequestMethod.GET)
	public User welcome(@PathVariable String userName){
		return this.userService.getUser(userName);
	}

}
