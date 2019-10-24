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

import com.lti.entity.BusDetails;
import com.lti.entity.User;

@Repository
public class SearchDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public List<BusDetails> getBusDetails(String src, String destination) {
		String sql = "select b from BusDetails b where b.src=:src and b.destination=:des";
		Query query = entityManager.createQuery(sql);
		query.setParameter("src", src);
		query.setParameter("des", destination);
		return query.getResultList();
	}
}
