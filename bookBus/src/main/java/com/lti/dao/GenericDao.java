package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class GenericDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public int save(Object object) {
		int flag = 0;
		if(object!= null){
			flag =1 ;
			entityManager.merge(object);
		}
		else {
			flag=0;
			System.out.println("Don't register user");
		}
		return flag;
		//update the existing user data or insert user data if not registered
	}
}
