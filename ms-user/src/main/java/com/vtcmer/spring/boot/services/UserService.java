package com.vtcmer.spring.boot.services;

import com.vtcmer.spring.boot.model.User;

public interface UserService {
	
	
	User getUser(final String userName);

}
