package com.lti.controller;

import java.time.LocalDate;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.entity.Booking;
import com.lti.entity.BusDetails;
import com.lti.entity.User;
import com.lti.service.BookingService;

@Controller
@SessionAttributes({"user","busDetails","date","booking","noOfSeats"})
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@RequestMapping(path="/booking.lti", method=RequestMethod.POST)
	public String addBooking(HttpServletRequest request, Map model) throws Exception {
		User user=(User)model.get("user");
		BusDetails busDetails=(BusDetails)model.get("busDetails");
		String busNo = busDetails.getBusNo();
		LocalDate date=(LocalDate)model.get("date");
		String dateOfJouney = date.toString();
		
		String seats = (String)request.getSession().getAttribute("noOfSeats");
		int seatsSelected = Integer.parseInt(seats);
		int fare = busDetails.getFare();
		int totalFare=seatsSelected*fare;
		
		Booking booking = new Booking();
		booking.setDateOfJourney(dateOfJouney);
		booking.setTotalFare(totalFare);
		booking.setNoOfSeats(seatsSelected);
		booking.setUser(user);
		booking.setBusDetails(busDetails);
		
		//Adding buses
		bookingService.addBooking(booking);
		model.put("booking", booking);
		
		//Updating available seats in seatsavailable table
		bookingService.updateAvailableSeats(busNo, dateOfJouney, seatsSelected);
		
		return "";
	}
}
