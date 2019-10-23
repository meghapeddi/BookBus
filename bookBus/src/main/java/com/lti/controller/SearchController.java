package com.lti.controller;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.service.SearchService;


@Controller 
public class SearchController {

	@Autowired
	private SearchService searchService;
	
	@RequestMapping(path="/search.lti", method=RequestMethod.POST)
	public String search(@RequestParam("src") String src, @RequestParam("destination")String destination, @RequestParam("date")String dateOfJourney, Map model) {
		LocalDate date = LocalDate.parse(dateOfJourney);
		DayOfWeek day= date.getDayOfWeek();
		System.out.println(day);
		searchService.search(src, destination, day);
		model.put("data", "obj");
		return "search.jsp";
	}
}
