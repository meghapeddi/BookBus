package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.entity.City;
import com.lti.entity.Stops;
import com.lti.entity.User;

@Repository
public class LoginDao {

	@PersistenceContext
	private EntityManager entityManager;

	public User fetchUser(String email) {
		// TODO Auto-generated method stub
		String sql = "select u from User u where u.email = :em";
		Query query = entityManager.createQuery(sql);
		query.setParameter("em", email);
		return (User) query.getSingleResult();

	}

	public List<City> getCity() {
		// TODO Auto-generated method stub
		String sql= "select c from City c";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}
}
