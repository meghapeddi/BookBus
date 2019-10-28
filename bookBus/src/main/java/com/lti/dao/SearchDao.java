package com.lti.dao;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.entity.BusDetails;
import com.lti.entity.SeatsAvailable;
import com.lti.entity.Stops;
import com.lti.entity.User;

@Repository
@SessionAttributes()
public class SearchDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public List<BusDetails> getBusDetails(String src, String destination, LocalDate date) throws Exception {
		//String sql = "select b from BusDetails b where b.src like :src and b.destination like :destination";
		//String sql = "select b, s from BusDetails b join b.SeatsAvailable s where b.src=:src and b.destination=:destination and s.date=:date";
		String sql = "select b, s from BusDetails b join fetch b.seatsAvailable s where b.src=:src and b.destination=:destination and s.dailyDate=:date";
		Query query = entityManager.createQuery(sql);
		query.setParameter("src", src);
		query.setParameter("destination", destination);
		query.setParameter("date", date);
		return query.getResultList();
	}

	public List<Stops> getBoardingStops(String src) throws Exception {
		// TODO Auto-generated method stub
		String sql = "select s from Stops s where s.city=:city ";
		Query query = entityManager.createQuery(sql);
		query.setParameter("city", src);
		return query.getResultList();
	}

	public List<Stops> getDroppingStops(String destination) throws Exception {
		// TODO Auto-generated method stub
		String sql = "select s from Stops s where s.city=:city ";
		Query query = entityManager.createQuery(sql);
		query.setParameter("city", destination);
		return query.getResultList();
	}
}
//	public List<SeatsAvailable> getAvailableSeats(LocalDate date) throws Exception {
//		String sql = "select s from SeatsAvailable s where s.dailyDate=:date";
//		Query query = entityManager.createQuery(sql);
//		query.setParameter("date", date);
//		return query.getResultList();
//	}
//}
