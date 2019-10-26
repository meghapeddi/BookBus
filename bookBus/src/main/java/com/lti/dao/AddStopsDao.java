package com.lti.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.entity.Stops;

@Repository
public class AddStopsDao {

	@Autowired
	private GenericDao genericDao;
	
	public int save(Stops stop) throws Exception{
		int flag=0;
		if (stop != null) {
			flag = 1;
			genericDao.save(stop);
		}else{
			System.out.println("Dont allow to add stops");
		}
		return flag;
		
	}
}
