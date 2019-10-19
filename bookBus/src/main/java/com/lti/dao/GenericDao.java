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
	public void save(Object object) {
		entityManager.merge(object);//update the existing user data or insert user data if not registered
	}
}
