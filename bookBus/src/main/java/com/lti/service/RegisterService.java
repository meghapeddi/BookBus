package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.dao.GenericDao;
import com.lti.entity.User;
import com.lti.interfaces.UserInterface;

public class RegisterService implements UserInterface{

	@Autowired
	private GenericDao dao;

	public int  register(User user) {
		// TODO Auto-generated method stub
		int flag  = dao.save(user);
		return flag;
	}

}
