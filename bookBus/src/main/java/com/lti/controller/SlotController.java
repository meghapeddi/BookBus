package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.entity.Slot;
import com.lti.service.SlotsService;

@Controller
public class SlotController {

	@Autowired
	private SlotsService slotsService;
	
	@RequestMapping(path = "/slots.lti", method = RequestMethod.POST)
	public String addStops(Slot slot, Map model) {
		int flag = slotsService.addStops(slot);
		if (flag == 1) {
			model.put("message", "Slot added");
			return "success.jsp";
		} else {
			model.put("message", "Adding slot failed");
			return "error.jsp";
		}

	}
}
