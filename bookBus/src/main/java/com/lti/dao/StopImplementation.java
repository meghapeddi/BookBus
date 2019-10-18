package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Stops;
import com.lti.interfaces.Stop;

@Component("stop")
public class StopImplementation implements Stop{

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void addStop(Stops stop) {
		entityManager.persist(stop);
	}
	
}
