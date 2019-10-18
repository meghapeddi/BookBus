package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.City;
import com.lti.entity.Stops;
import com.lti.interfaces.CityInterface;

public class CityService implements CityInterface{

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void addCity(City city) {
		// TODO Auto-generated method stub
		entityManager.persist(city);
	}
}
