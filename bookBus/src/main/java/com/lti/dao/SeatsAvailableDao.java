package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.entity.SeatsAvailable;

@Repository
public class SeatsAvailableDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public SeatsAvailable availableSeats(String date) throws Exception {
		String sql = "select s from SeatsAvailable s where s.date=:date";
		Query query=entityManager.createQuery(sql);
		query.setParameter("date", date);
		return (SeatsAvailable) query.getSingleResult();
	}
}
