package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="tbl_seatsavailable")
public class SeatsAvailable {
	
	@Id
	@Column(name = "seatid")
	private int seatId;
	@Column(name = "dailydate")
	private String dailyDate;
	@Column(name = "availableseats")
	private int availableSeats;
	
	@ManyToOne
	@JoinColumn(name = "busno")
	private BusDetails busDetails;
	
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public String getDailyDate() {
		return dailyDate;
	}
	public void setDailyDate(String dailyDate) {
		this.dailyDate = dailyDate;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

}
