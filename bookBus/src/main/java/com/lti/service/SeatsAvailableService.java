package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.SeatsAvailableDao;
import com.lti.entity.BusDetails;
import com.lti.entity.SeatsAvailable;

@Service
public class SeatsAvailableService {

	@Autowired
	private SeatsAvailableDao seatsAvailableDao;
	
	public BusDetails getBusDetails(String busNo) throws Exception {
		BusDetails busDetails=seatsAvailableDao.getBusDetails(busNo);
		return busDetails;
	}
	
	public SeatsAvailable availableSeats(String busNo, String date) throws Exception{
		SeatsAvailable seats=seatsAvailableDao.availableSeats(busNo, date);
		return seats;
	}
}
