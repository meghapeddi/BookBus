package com.lti.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.entity.BusDetails;
import com.lti.entity.SeatsAvailable;
import com.lti.entity.User;
import com.lti.service.SeatsAvailableService;

@Controller
@SessionAttributes({"searchValues","date","noOfSeats"})
public class SeatsAvailableController {

	@Autowired
	private SeatsAvailableService seatsAvailableService;
	
		@RequestMapping(path="availableSeats.lti", method=RequestMethod.POST)
		public String available(@RequestParam("noOfSeats")int noOfSeats, Map model) throws Exception {
		ArrayList<String> searchValues=(ArrayList<String>)model.get("searchValues");
		String busNo = searchValues.get(0);
		LocalDate date =(LocalDate)model.get("date");
		String dateOfJourney=date.toString();
		BusDetails bus = seatsAvailableService.getBusDetails(busNo);
		SeatsAvailable seats=seatsAvailableService.availableSeats(busNo, dateOfJourney);
		model.put("seats", seats);
		model.put("busDetails", bus);
		model.put("noOfSeats", noOfSeats);
		return "";
	}
}
