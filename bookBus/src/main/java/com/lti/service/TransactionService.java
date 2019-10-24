package com.lti.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.TransactionDao;

@Service
public class TransactionService {
	
	@Autowired
	TransactionDao transactionDao;
	
	public int getAvailableSeats(LocalDate date) throws Exception {
		return transactionDao.getAvailableSeats(date);
	}

}
