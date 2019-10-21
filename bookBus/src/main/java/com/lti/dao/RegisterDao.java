package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.entity.User;

@Repository
public class RegisterDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public int save(User user) {
		int flag = 0;
		if (user != null) {
			flag = 1;
			entityManager.persist(user);
		} else {
			flag = 0;
			System.out.println("Don't register user");
		}
		return flag;

	}
}
