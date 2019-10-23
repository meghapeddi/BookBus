package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.SlotsDao;
import com.lti.entity.Slot;

@Service
public class SlotsService {

	@Autowired
	private SlotsDao slotsDao;
	
	public int addStops(Slot slot) {
		// TODO Auto-generated method stub
		int flag = slotsDao.save(slot);
		return flag;
	}
}
