package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.entity.BusDetails;
import com.lti.entity.Stops;
import com.lti.entity.User;
import com.lti.interfaces.BusInterface;

@Repository
public class BusDao {

	@Autowired
	private GenericDao genericDao;
	
	public int save(BusDetails bus) throws Exception{
		int flag=0;
		if (bus != null) {
			flag = 1;
			genericDao.save(bus);
		}else{
			System.out.println("Dont allow to add stops");
		}
		return flag;
		
	}
}
