package com.lti.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.lti.dao.RegisterDao;
import com.lti.entity.User;
import com.lti.interfaces.UserInterface;

@Service
public class RegisterService implements UserInterface{

	@Autowired
	private RegisterDao dao;

	public int  register(User user) {
		// TODO Auto-generated method stub
		int flag  = dao.save(user);
		return flag;
	}

}
