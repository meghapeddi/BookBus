package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.entity.User;
import com.lti.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(path = "/login.lti",method = RequestMethod.POST)
	
	public String verify(@RequestParam("email") String email,@RequestParam("password") String password,Map model){
		int check = loginService.verify(email,password);
		if(check == 1) {
			model.put("message","login success");
			return "loginsuccess.jsp";
		}else {
			model.put("message","login failure");
			return "loginfail.jsp";
		}
		
		
	}

}
