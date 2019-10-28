package com.lti.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.dto.SearchDTO;
import com.lti.entity.Booking;
import com.lti.entity.BusDetails;
import com.lti.entity.PassengerDetails;
import com.lti.entity.User;
import com.lti.service.BookingService;

@Controller
@SessionAttributes({"user","searchData","date","booking","noOfSeats","passengerList"})
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@RequestMapping(path="/booking.lti", method=RequestMethod.POST)
	public String addBooking(HttpServletRequest request, Map model) throws Exception {
		User user=(User)model.get("user");
		SearchDTO searchDTO=(SearchDTO)model.get("searchData");
		String busNo=searchDTO.getBusNo();
		String boardingPoint=searchDTO.getBoardingPoint();
		String dropPoint=searchDTO.getDropPoint();
		LocalDate date=(LocalDate)model.get("date");
		//String dateOfJouney = date.toString();
		
		String seats = (String)request.getSession().getAttribute("noOfSeats");
		int seatsSelected = Integer.parseInt(seats);
		BusDetails busDetails=bookingService.fetchBus(busNo);
		int fare=busDetails.getFare();
		int totalFare=seatsSelected*fare;
		
		Booking booking = new Booking();
		booking.setDateOfJourney(date);
		booking.setTotalFare(totalFare);
		booking.setNoOfSeats(seatsSelected);
		booking.setUser(user);
		booking.setBusDetails(busDetails);
		
		List<PassengerDetails> passengers = (List<PassengerDetails>)model.get("passengerList");
		
		PassengerDetails passengerDetails=new PassengerDetails();
		for(PassengerDetails passenger:passengers){
			passenger.setUser(user);
			passenger.setBoardingPoint(boardingPoint);
			passenger.setDropPoint(dropPoint);
			passenger.setPassengerName(passengerDetails.getPassengerName());
			passenger.setAge(passengerDetails.getAge());
			passenger.setGender(passengerDetails.getGender());
			passenger.setSeatNo(passengerDetails.getSeatNo());
		}
		
		
		
		//Adding buses
		bookingService.addBooking(booking);
		model.put("booking", booking);
		
		//Updating available seats in seatsavailable table
		bookingService.updateAvailableSeats(busNo, date, seatsSelected);
		
		
		return "";
	}
}
