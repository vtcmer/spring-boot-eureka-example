package com.vtcmer.spring.boot.repository;

import com.vtcmer.spring.boot.model.User;

public interface UserRepository {
	
	User getUser(final String userName);

}
