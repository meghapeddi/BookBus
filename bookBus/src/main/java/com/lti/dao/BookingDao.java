package com.lti.dao;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Booking;
import com.lti.entity.BusDetails;
import com.lti.entity.PassengerDetails;
import com.lti.entity.SeatsAvailable;

@Repository
public class BookingDao  {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private GenericDao genericDao;
	
	@Transactional
	public void addBooking(Booking booking) throws Exception{
		genericDao.save(booking);
	}
	
	public SeatsAvailable getAvailableSeats(String busNo, LocalDate date) throws Exception{
		String sql = "select s from SeatsAvailable s join fetch s.busDetails b where b.busNo=:number and s.dailyDate=:date";
		Query query=entityManager.createQuery(sql);
		query.setParameter("number", busNo);
		query.setParameter("date", date);
		return (SeatsAvailable) query.getSingleResult();
	}
	public BusDetails fetchBus(String busNo) {
		String sql = "select b from BusDetails b where b.busNo=:number";
		Query query=entityManager.createQuery(sql);
		query.setParameter("number", busNo);
		return (BusDetails) query.getSingleResult();
	}
	public void addPassenger(PassengerDetails passengerDetails) throws Exception {
		genericDao.save(passengerDetails);
	}
}
