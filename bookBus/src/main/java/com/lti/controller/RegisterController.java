package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.dto.UserDTO;
import com.lti.entity.User;
import com.lti.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService;

	@RequestMapping(path = "/register.lti", method = RequestMethod.POST)
	public void register(UserDTO data, Map model) {

		User user = new User();
		user.setFname(data.getFname());
		user.setLname(data.getLname());
		user.setEmail(data.getEmail());
		user.setPassword(data.getPassword());
		user.setContact(data.getContactNo());
		user.setDob(data.getDob());
		user.setGender(data.getGender());
		user.setType(data.getType());

		registerService.register(user);
		
	}

}
