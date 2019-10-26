package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.entity.Stops;
import com.lti.service.AddStopsService;

@Controller
public class AddStopsController {

	@Autowired
	private AddStopsService addStopsService;

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
