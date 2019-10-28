package com.lti.controller;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.dto.PassengerDTO;
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
		
		int seats = (Integer)request.getSession().getAttribute("noOfSeats");
		//int seatsSelected = Integer.parseInt(seats);
		BusDetails busDetails=bookingService.fetchBus(busNo);
		int fare=busDetails.getFare();
		int totalFare=seats*fare;
		
		Booking booking = new Booking();
		booking.setDateOfJourney(date);
		booking.setTotalFare(totalFare);
		booking.setNoOfSeats(seats);
		booking.setUser(user);
		booking.setBusDetails(busDetails);
		bookingService.addBooking(booking);
		model.put("booking", booking);
		
		List<PassengerDTO> passengersList = (List<PassengerDTO>)model.get("passengerList");
		//Set<PassengerDetails> passengerSet = new HashSet<PassengerDetails>();
		PassengerDetails passengerDetails=new PassengerDetails();
		for(PassengerDTO passenger:passengersList){
			passengerDetails.setUser(user);
			passengerDetails.setBoardingPoint(boardingPoint);
			passengerDetails.setDropPoint(dropPoint);
			passengerDetails.setPassengerName(passengerDetails.getPassengerName());
			passengerDetails.setAge(passengerDetails.getAge());
			passengerDetails.setGender(passengerDetails.getGender());
			passengerDetails.setSeatNo(passengerDetails.getSeatNo());
			passengerDetails.setBooking(booking);
			bookingService.updatePassengerDetails(passengerDetails);
		}
		
		//Adding buses
	
		//Updating available seats in seatsavailable table
		bookingService.updateAvailableSeats(busNo, date, seats);
		
		
		return "";
	}
}
