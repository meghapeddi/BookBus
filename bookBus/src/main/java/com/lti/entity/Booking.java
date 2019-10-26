package com.lti.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="tbl_booking")
public class Booking {
	
	@Id
	@Column(name = "transactionid")
	private int transactionId;
	@Column(name = "noofseats")
	private int noOfSeats;
	@Column(name = "dateofjourney")
	private String dateOfJourney;
	@Column(name = "totalfare")
	private int totalFare;
	
	@ManyToOne
	@JoinColumn(name = "busno")
	private BusDetails busDetails;
	
	@ManyToOne
	@JoinColumn(name = "userid")
	private User user;
	
	@OneToMany(mappedBy="booking")
	private Set<PassengerDetails> passenger;
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(String dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	public int getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(int totalFare) {
		this.totalFare = totalFare;
	}
	public BusDetails getBusDetails() {
		return busDetails;
	}
	public void setBusDetails(BusDetails busDetails) {
		this.busDetails = busDetails;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<PassengerDetails> getPassenger() {
		return passenger;
	}
	public void setPassenger(Set<PassengerDetails> passenger) {
		this.passenger = passenger;
	}

}
