package com.lti.controller;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.dto.SearchDTO;


@Controller
@SessionAttributes({"noOfSeats","searchData"})
public class SeatsAvailableController {
	
	@RequestMapping(path="/sendBusNo.lti", method=RequestMethod.POST)
	public String getBusNo(SearchDTO data, Map model) throws Exception {
		SearchDTO search=new SearchDTO();
		search.setBusNo(data.getBusNo());
		search.setBoardingPoint(data.getBoardingPoint());
		search.setDropPoint(data.getDropPoint());
		
		model.put("searchData", search);
		return "noOfSeats.jsp";
	}
	
	@RequestMapping(path="/seatsSelected.lti", method=RequestMethod.POST)
	public String getNoOfSeats(HttpServletRequest request,@RequestParam("noOfSeats")String noOfSeats, Map model) {
		//String busNo = request.getParameter("seats");
		//System.out.println(busNo);
		int noSeats = Integer.parseInt(noOfSeats);
		model.put("noOfSeats", noSeats);
		return "passengers.jsp";
	}
}
