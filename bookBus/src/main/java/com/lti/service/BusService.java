package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.BusDao;
import com.lti.dao.GenericDao;
import com.lti.entity.BusDetails;
import com.lti.interfaces.BusInterface;

@Service
public class BusService implements BusInterface{
	
	@Autowired
	private BusDao busDao;

	public void addBuses(BusDetails bus) {
		// TODO Auto-generated method stub
		busDao.save(bus);
		
	}

	

}
