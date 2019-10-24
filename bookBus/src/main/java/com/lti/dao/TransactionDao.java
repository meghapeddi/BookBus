package com.lti.dao;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.entity.User;

@Repository
public class TransactionDao {
	@Autowired
	EntityManager entityManager;

	public int getAvailableSeats(LocalDate date) throws Exception {
		// TODO Auto-generated method stub
		String sql= "select a.availableSeats from AvailableSeats a where date = :date";
		Query query = entityManager.createQuery(sql);
		query.setParameter("date",date);		
		return (Integer)query.getSingleResult();
		
	}

}
