package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.dao.LoginDao;
import com.lti.entity.User;

public class LoginService {
	
	@Autowired
	private LoginDao loginDao;

	public User verify(String email) {
		return loginDao.fetchUser(email);
		// TODO Auto-generated method stub
		
	}

	
}
