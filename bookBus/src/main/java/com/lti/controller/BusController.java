package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.dto.UserDTO;
import com.lti.entity.BusDetails;
import com.lti.entity.User;
import com.lti.service.BusService;


@Controller
public class BusController {
	
	@Autowired
	private BusService busService;

	@RequestMapping(path = "/addbuses.lti", method = RequestMethod.POST)
	public String register(BusDetails data, Map model) {

		BusDetails bus = new BusDetails();
		bus.setBusNo(data.getBusNo());
		bus.setBusName(data.getBusName());
		bus.setSrc(data.getSrc());
		bus.setDestination(data.getDestination());
		bus.setSlotNo(data.getSlotNo());
		bus.setType(data.getType());
		bus.setNoOfSeats(20);
		//user.setType(data.getType());
		
		 busService.addBuses(bus);
		 model.put("buses","Buses added");
		 return "success.jsp";
		
		/*if(flag ==1){
			model.put("message", "busesAdded");
			return "confirmation.jsp";
		}
		else{
			model.put("message", "buses not added");
			return "error.jsp";
		}
		*/
	}
	
}
