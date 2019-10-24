package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.entity.City;
import com.lti.entity.User;
import com.lti.service.LoginService;

@Controller
@SessionAttributes("user")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(path = "/login.lti",method = RequestMethod.POST)
	
	public String verify(@RequestParam("email") String email,@RequestParam("password") String password,Map model){
		User user = loginService.verify(email,password);
		List<City>city = loginService.fetchCity();
		if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
			model.put("user", user);
			model.put("city",city);
			return "index.jsp";
		}else{
			return "login.jsp";
		}
		
		
		/*if(check == 1) {
			model.put("message","login success");
			return "loginsuccess.jsp";
		}else {
			model.put("message","login failure");
			return "loginfail.jsp";
		}*/
		
	}

}
