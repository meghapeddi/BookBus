package com.lti.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.entity.Slot;

@Repository
public class SlotsDao {

	@Autowired
	private GenericDao genericDao;
	
	public int save(Slot slot){
		int flag=0;
		if (slot != null) {
			flag = 1;
			genericDao.save(slot);
		}else{
			System.out.println("Dont allow to add slots");
		}
		return flag;
		
	} 
}
