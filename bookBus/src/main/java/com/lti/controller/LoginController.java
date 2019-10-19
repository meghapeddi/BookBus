package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.entity.User;
import com.lti.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	
	public String verify(@RequestParam("email") String email,@RequestParam("password") String password,Map model){
		loginService.verify(email);
		return "";
		
	}

}
