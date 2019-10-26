package com.lti.controller;

import java.net.Authenticator.RequestorType;
import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("searchValues")
public class SearchValueController {

	@RequestMapping(path = "/searchValues.lti", method = RequestMethod.POST)
	public void getSearchValues(@RequestParam("busno")String busNo, @RequestParam("srcCity")String srcCity, @RequestParam("destCity")String destCity, Map model) {
		ArrayList<String> searchValues = new ArrayList<String>();
		searchValues.add(busNo);
		searchValues.add(srcCity);
		searchValues.add(destCity);
		
		model.put("searchValues", searchValues);
	}
}
