package com.lti.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"busNo", "noOfSeats"})
public class SeatsController {

	@RequestMapping(path="/seats.lti", method=RequestMethod.POST)
	public String seatsSelected(@RequestParam(name = "busno")String busNo, @RequestParam(name = "noofseats")int noOfSeats, Map model) {
		model.put("busNo", busNo);
		model.put("noOfSeats", noOfSeats);
		return "passenger.jsp";
	}
}
