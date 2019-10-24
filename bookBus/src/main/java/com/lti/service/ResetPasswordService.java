package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.ResetPasswordDao;
import com.lti.entity.User;

@Service
public class ResetPasswordService {

	@Autowired
	private ResetPasswordDao resetPasswordDao;
	
	public void changePassword(String email, String password) throws Exception {
		User u = (User) resetPasswordDao.fetchByEmail(email);
		
		u.setPassword(password);
		resetPasswordDao.save(u);
	}
}
