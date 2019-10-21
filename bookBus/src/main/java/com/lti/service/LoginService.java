package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.LoginDao;
import com.lti.entity.User;

@Service
public class LoginService {

	@Autowired
	private LoginDao loginDao;

	public int verify(String email, String password) {
		int flag = 0;
		User user = loginDao.fetchUser(email);
		if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
			flag = 1;
		} else if (email.equals("admin@lti.com") && password.equals("admin123")) {
			flag = 1;
		} else {
			flag = 0;
		}
		// TODO Auto-generated method stub
		return flag;

	}
}
