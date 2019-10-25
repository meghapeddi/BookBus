package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.entity.BusDetails;
import com.lti.entity.SeatsAvailable;
import com.lti.service.SeatsAvailableService;

@Controller
@SessionAttributes({"seats", "busDetails"})
public class SeatsAvailableController {

	@Autowired
	private SeatsAvailableService seatsAvailableService;
	
		@RequestMapping(path="availableSeats.lti", method=RequestMethod.POST)
		public String available(@RequestParam("busNo")String busNo, @RequestParam("date")String date, Map model) throws Exception {
		BusDetails bus = seatsAvailableService.getBusDetails(busNo);
		SeatsAvailable seats=seatsAvailableService.availableSeats(date);
		model.put("seats", seats);
		model.put("busDetails", bus);
		return "";
	}
}
