package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.entity.City;
import com.lti.entity.User;

@Controller
public class AdminController {

	@RequestMapping(path = "/adminLogin.lti", method = RequestMethod.POST)

	public String verify(@RequestParam("email") String email, @RequestParam("password") String password, Map model) {
		if (email.equals("admin@lti.com") && password.equals("admin123")) {
			model.put("message", "admin login success");
			return "addbusdetails.jsp";
		} else {
			return "adminLogin.jsp";
		}
	}
}
