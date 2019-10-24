package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.entity.User;

@Repository
public class RegisterDao {

	@Autowired
	private GenericDao genericDao;

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public int save(User user) throws Exception {
		int flag = 0;
			if (user != null) {
				flag = 1;
				genericDao.save(user);
			}else {
				flag = 0;
				System.out.println("Don't register user");
			}
		return flag;
	}
}
