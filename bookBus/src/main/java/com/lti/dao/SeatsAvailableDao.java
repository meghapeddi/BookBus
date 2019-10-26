package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.entity.BusDetails;
import com.lti.entity.SeatsAvailable;

@Repository
public class SeatsAvailableDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public BusDetails getBusDetails(String busNo) throws Exception {
		String sql = "select b from BusDetails b where b.busNo=:number";
		Query query=entityManager.createQuery(sql);
		query.setParameter("number", busNo);
		return (BusDetails) query.getSingleResult();
	}
	
	public SeatsAvailable availableSeats(String busNo, String date) throws Exception {
		String sql = "select s from SeatsAvailable s where s.busno=:no s.date=:date";
		Query query=entityManager.createQuery(sql);
		query.setParameter("no", busNo);
		query.setParameter("date", date);
		return (SeatsAvailable) query.getSingleResult();
	}
	
}
