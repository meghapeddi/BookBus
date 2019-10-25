package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.entity.User;
import com.lti.service.ForgotPasswordService;

@Controller
@SessionAttributes("forgotuser")
public class ForgotPasswordController {

	@Autowired
	private ForgotPasswordService forgotPasswordService;
	
	@RequestMapping(path="/forgotpassword.lti", method=RequestMethod.POST)
	public String forgotPassword(@RequestParam("email") String email, Map model) throws Exception {
		User user = forgotPasswordService.verifyEmail(email);
		if(email.equals(user.getEmail())) {
			model.put("forgotuser", user);
			return "resetpassword.jsp";
		} else {
			return "forgotpassword.jsp";
		}
	}
}
