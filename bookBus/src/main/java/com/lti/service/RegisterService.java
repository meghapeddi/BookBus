package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.dao.GenericDao;
import com.lti.entity.User;

public class RegisterService {

	@Autowired
	private GenericDao dao;

	public void register(User user) {
		dao.save(user);
	}
}
