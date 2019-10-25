package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.entity.User;
import com.lti.service.ResetPasswordService;

@Controller
@SessionAttributes("forgotuser")
public class ResetPasswordController {
	
	@Autowired
	private ResetPasswordService resetPasswordService;
	
	@RequestMapping(path="/resetPassword.lti", method=RequestMethod.POST)
	public String resetPassword(@RequestParam("new")String newPassword,@RequestParam("confirm") String confirmPassword, Map model) throws Exception {
		User user = (User) model.get("forgotuser");
		String email = user.getEmail();
		if(newPassword.equals(confirmPassword)) {
			resetPasswordService.changePassword(email, newPassword);
			return "login.jsp";
		} else {
			
			return "resetpassword.jsp";
		}
	}

}
