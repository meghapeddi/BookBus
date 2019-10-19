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
	public String register(UserDTO data, Map model) {

		User user = new User();
		user.setFname(data.getFname());
		user.setLname(data.getLname());
		user.setEmail(data.getEmail());
		user.setPassword(data.getPassword());
		user.setContactno(data.getContactno());
		user.setGender(data.getGender());
		//user.setType(data.getType());
		
		int flag = registerService.register(user);
		
		if(flag ==1){
			model.put("message", "registered");
			return "confirmation.jsp";
		}
		else{
			model.put("message", "unregistered");
			return "error.jsp";
		}
		
	}

}
