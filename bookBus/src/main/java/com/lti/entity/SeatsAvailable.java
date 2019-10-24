package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="tbl_seatsavailable")
public class SeatsAvailable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEAT_AUTO_INCR")
	@SequenceGenerator(name = "SEAT_AUTO_INCR", sequenceName = "SEAT_AUTO_INCR", allocationSize = 1)
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
