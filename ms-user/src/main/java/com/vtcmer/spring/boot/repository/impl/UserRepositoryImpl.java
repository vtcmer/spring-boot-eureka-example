package com.vtcmer.spring.boot.repository.impl;

import org.springframework.stereotype.Repository;

import com.vtcmer.spring.boot.model.User;
import com.vtcmer.spring.boot.repository.UserRepository;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository{

	@Override
	public User getUser(String userName) {
		// TODO Auto-generated method stub
		return this.getUserMock(userName);
	}
	
	private User getUserMock(final String userName){
		User user = new User();
		user.setUserName(userName);
		user.setName("[Name]"+userName);
		user.setEmail(userName+"@email.com");
		return user;
	}

}
