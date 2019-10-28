package com.lti.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.entity.City;
import com.lti.entity.Stops;
import com.lti.entity.User;
import com.lti.service.AddStopsService;
import com.lti.service.LoginService;

@Controller
@SessionAttributes({"cities"})
public class AdminController {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private AddStopsService addStopsService;

	@RequestMapping(path = "/adminLogin.lti", method = RequestMethod.POST)
	public String verify(@RequestParam("email") String email, @RequestParam("password") String password, Map model) {
		List<City>cities = loginService.fetchCity();
		if (email.equals("admin@lti.com") && password.equals("admin123")) {
			model.put("message", "admin login success");
			model.put("cities", cities);
			return "addbusdetails.jsp";
		} else {
			return "adminLogin.jsp";
		}
	}
	@RequestMapping(path = "/adminLogout.lti", method=RequestMethod.GET)
	public String logout(ModelMap model, HttpSession session){
		session.invalidate();
		return "index.jsp";
	}
	
	
	@RequestMapping(path = "/addStops.lti", method = RequestMethod.POST)
	public String addStops(Stops stop, Map model) throws Exception {
		int flag = addStopsService.addStops(stop);
		if (flag == 1) {
			model.put("message", "Stop added");
			return "success.jsp";
		} else {
			model.put("message", "Adding stop failed");
			return "error.jsp";
		}

	}
}
