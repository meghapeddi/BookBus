package com.lti.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Fare {
	
	@Id
	@GeneratedValue
	private int id;
	private int fare;
	
	/*
	@OneToOne
	@JoinColumn(name ="busno")
	private BusDetails bus;*/

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

}
