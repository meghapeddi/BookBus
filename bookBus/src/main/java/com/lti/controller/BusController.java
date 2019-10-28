package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.dto.BusDTO;
import com.lti.entity.BusDetails;
import com.lti.entity.City;
import com.lti.interfaces.BusInterface;
import com.lti.service.LoginService;

@Controller
public class BusController {

	@Autowired
	private BusInterface busInterface;

	@RequestMapping(path = "/addbuses.lti", method = RequestMethod.POST)
	public String register(BusDTO data, Map model) throws Exception{
		BusDetails bus = new BusDetails();
		bus.setBusNo(data.getBusNo());
		bus.setBusName(data.getBusName());
		bus.setSrc(data.getSrc());
		bus.setDestination(data.getDestination());
		bus.setDepartureTime(data.getDepartureTime());
		bus.setArrivalTime(data.getArrivalTime());
		bus.setTravelTime(data.getTravelTime());
		bus.setType(data.getType());
		bus.setFare(data.getFare());
		

		busInterface.addBuses(bus);
		model.put("buses", "Buses added");
		return "success.jsp";

		/*
		 * if(flag ==1){ model.put("message", "busesAdded"); return
		 * "confirmation.jsp"; } else{ model.put("message", "buses not added");
		 * return "error.jsp"; }
		 */
	}

}
