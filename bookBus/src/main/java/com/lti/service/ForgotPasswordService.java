package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.ForgotPasswordDao;
import com.lti.entity.User;

@Service
public class ForgotPasswordService {

	@Autowired
	private ForgotPasswordDao forgotPasswordDao;
	
	public User verifyEmail(String email) throws Exception{
		User user = forgotPasswordDao.checkUser(email);
		return user;
	}
	
}
