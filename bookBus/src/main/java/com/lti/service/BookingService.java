package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.BookingDao;
import com.lti.dao.GenericDao;
import com.lti.entity.Booking;
import com.lti.entity.PassengerDetails;
import com.lti.entity.SeatsAvailable;

@Service
public class BookingService {

	@Autowired
	private BookingDao bookingDao;
	private GenericDao genericDao;
	
	public void addBooking(Booking booking) throws Exception {
		bookingDao.addBooking(booking);
	}
	
	public void updateAvailableSeats(String busNo, String date, int noOfSeats) throws Exception {
		SeatsAvailable seats=bookingDao.getAvailableSeats(busNo, date);
		int availableSeats=seats.getAvailableSeats()-noOfSeats;
		seats.setAvailableSeats(availableSeats);
		genericDao.save(seats);
	}
	
	public void updatePassengerDetails(PassengerDetails passengerDetails) throws Exception {
		bookingDao.addPassenger(passengerDetails);
	}
}
