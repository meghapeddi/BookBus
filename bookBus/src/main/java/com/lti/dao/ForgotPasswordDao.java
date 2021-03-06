package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.entity.User;

@Repository
public class ForgotPasswordDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public User checkUser(String email) throws Exception{
		String sql = "select u from User u where u.email=:em";
		Query query = entityManager.createQuery(sql);
		query.setParameter("em", email);
		return (User)query.getSingleResult();
	}
}
