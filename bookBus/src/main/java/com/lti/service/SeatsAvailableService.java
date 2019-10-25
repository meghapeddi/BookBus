package com.lti.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.SeatsAvailableDao;
import com.lti.entity.BusDetails;
import com.lti.entity.SeatsAvailable;

@Service
public class SeatsAvailableService {

	@Autowired
	private SeatsAvailableDao seatsAvailableDao;
	
	public SeatsAvailable availableSeats(String date) throws Exception{
		SeatsAvailable seats=seatsAvailableDao.availableSeats(date);
		return seats;
	}

	public BusDetails getBusDetails(String busNo) throws Exception {
		// TODO Auto-generated method stub
		return seatsAvailableDao.getBusDetails(busNo);
		
	}
	
	public void displaySeatsPresent(){
		

		
		
		
		
	}
}
