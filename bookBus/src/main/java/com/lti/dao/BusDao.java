package com.lti.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.entity.BusDetails;
import com.lti.interfaces.BusInterface;

@Repository
public class BusDao {
	
	@Autowired
	GenericDao dao;

	public void save(BusDetails bus) {
		// TODO Auto-generated method stub
		dao.save(bus);
	}
}
