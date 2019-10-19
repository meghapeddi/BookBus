package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.AddStopsDao;
import com.lti.entity.Stops;
import com.lti.entity.User;
import com.lti.interfaces.StopInterface;

@Service
public class AddStopsService implements StopInterface {

	@Autowired
	private AddStopsDao addStopsDao;

	public int addStops(Stops stop) {
		// TODO Auto-generated method stub
		int flag = addStopsDao.save(stop);
		return flag;
	}

}
