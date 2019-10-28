package com.lti.controller;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import org.hibernate.id.enhanced.DatabaseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.entity.BusDetails;
import com.lti.entity.SeatsAvailable;
import com.lti.entity.Stops;
import com.lti.service.SearchService;


@Controller 
@SessionAttributes({"date","bus"})
public class SearchController {

	@Autowired
	private SearchService searchService;
	
	@RequestMapping(path="/search.lti", method=RequestMethod.POST)
	public String search(@RequestParam("src") String src, @RequestParam("destination")String destination, @RequestParam("date")String dateOfJourney, Map model) throws Exception{
		LocalDate dateSelected = LocalDate.parse(dateOfJourney);
		
		List<BusDetails> bus = searchService.search(src, destination, dateSelected);
		List<Stops> srcList = searchService.searchBoardingStops(src);
		List<Stops> destinationList = searchService.searchDroppingStops(destination);
		//List<SeatsAvailable> availableSeats = searchService.searchAvailableSeats(dateOfJourney);
		
//		for(SeatsAvailable seats :availableSeats){
//			System.out.println(seats.getAvailableSeats());
//		}
//		System.out.println(bus.get(0).getBusName());
		model.put("bus", bus);
		model.put("src", src);
		model.put("destination",destination);
		model.put("date",dateSelected);
		model.put("srcList", srcList);
		model.put("destList", destinationList);
		//model.put("seats", availableSeats);
		return "search1.jsp";
	}
	
	
	
}
