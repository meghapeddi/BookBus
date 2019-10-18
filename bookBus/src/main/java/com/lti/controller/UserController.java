package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.dto.UserDTO;
import com.lti.entity.User;
import com.lti.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	public void register(UserDTO data, Map model){
		
		User user = new User();
		user.setFname(data.getFname());
		user.setLname(data.getLname());
		user.setEmail(data.getEmail());
		user.setPassword(data.getPassword());
		user.setContact(data.getContactNo());
		user.setDob(data.getDob());
		user.setGender(data.getGender());
		user.setType(data.getType());
		
		userService.register(user);
	}
	
}
