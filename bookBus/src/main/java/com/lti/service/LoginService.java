package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.LoginDao;
import com.lti.entity.City;
import com.lti.entity.User;
import com.lti.interfaces.UserInterface;

@Service                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
public class LoginService {

	@Autowired
	private LoginDao loginDao;

	public User verify(String email, String password){
		
		User user = loginDao.fetchUser(email);
		return user;

	}
	
	public List<City> fetchCity(){
		List<City> city = loginDao.getCity();
		return city;
		
	}

}
