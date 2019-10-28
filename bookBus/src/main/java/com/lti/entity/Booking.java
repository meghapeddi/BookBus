package com.lti.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import net.bytebuddy.asm.Advice.Local;

@Entity
@Table(name ="tbl_booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOOK_AUTO_INCR")
	@SequenceGenerator(name = "BOOK_AUTO_INCR", sequenceName = "BOOK_AUTO_INCR", allocationSize = 1)
	//private int id;
	@Column(name = "transactionid")
	private int transactionId;
	@Column(name = "noofseats")
	private int noOfSeats;
	@Column(name = "dateofjourney")
	private LocalDate dateOfJourney;
	@Column(name = "totalfare")
	private int totalFare;
	
	@ManyToOne
	@JoinColumn(name = "busno")
	private BusDetails busDetails;
	
	@ManyToOne
	@JoinColumn(name = "userid")
	private User user;
	
	@OneToMany(mappedBy="booking",cascade = CascadeType.ALL)
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
	
	public LocalDate getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(LocalDate dateOfJourney) {
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
