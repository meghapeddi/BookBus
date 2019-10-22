package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.entity.BusDetails;
import com.lti.entity.User;
import com.lti.interfaces.BusInterface;

@Repository
public class BusDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void save(BusDetails bus) {
		entityManager.persist(bus);
	}
}
