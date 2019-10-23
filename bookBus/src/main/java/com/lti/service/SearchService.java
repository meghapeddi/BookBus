package com.lti.service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.SearchDao;
import com.lti.entity.BusDetails;

@Service
public class SearchService {

	@Autowired
	SearchDao searchDao;
	
	public List<BusDetails> search(String src, String destination, DayOfWeek day) {
		List<BusDetails> list=searchDao.getBusDetails(src, destination, day);
		return list;
	}
}
