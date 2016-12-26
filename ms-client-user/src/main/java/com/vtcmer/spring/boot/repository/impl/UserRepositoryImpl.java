package com.vtcmer.spring.boot.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.vtcmer.spring.boot.model.User;
import com.vtcmer.spring.boot.repository.UserRepository;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository{
	
	@Autowired
    private RestTemplate restTemplate;
    private String serviceUrl;
    
    public UserRepositoryImpl(final String serviceUrl){
    	this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl: "http://" + serviceUrl;
    }

	@Override
	public User getUser(String userName) {
		User user =  this.restTemplate.getForObject(this.serviceUrl+"/user/{userName}", User.class,userName);
		return user;
	}
	
	

}
