package com.lti.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.entity.BusDetails;
import com.lti.entity.User;
import com.lti.service.TransactionService;

@Controller
@SessionAttributes("user,bus,date")
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;

	@RequestMapping(path = "/booking.lti", method = RequestMethod.POST)
	public String transaction(@RequestParam("noOfSeats") String nos, Map model)throws Exception{
		/*
		 * int noOfSeats = Integer.parseInt(nos); int seats =
		 * transactionService.getAvailableSeats(date); int availableSeats = seats -
		 * noOfSeats;
		 */
		return null;

	}
}
