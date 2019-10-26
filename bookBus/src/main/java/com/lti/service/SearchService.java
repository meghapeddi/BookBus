package com.lti.service; 

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.SearchDao;
import com.lti.entity.BusDetails;
import com.lti.entity.SeatsAvailable;
import com.lti.entity.Stops;

@Service
public class SearchService {

	@Autowired
	SearchDao searchDao;
	
	public List<BusDetails> search(String src, String destination,String date) throws Exception{
		List<BusDetails> list=searchDao.getBusDetails(src, destination, date);
		return list;
	}
	
	public List<Stops> searchBoardingStops(String src) throws Exception{
		List<Stops> stops = searchDao.getBoardingStops(src);
		return stops;	
	}
	
	public List<Stops> searchDroppingStops(String destination) throws Exception{
		List<Stops> stops = searchDao.getDroppingStops(destination);
		return stops;	
	}
//	public List<SeatsAvailable> searchAvailableSeats(String date) throws Exception{
//		List<SeatsAvailable> seats = searchDao.getAvailableSeats(date);
//		return seats;
//	}
	
	//public List<BusDetails> fetchStops
}
