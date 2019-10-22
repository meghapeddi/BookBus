package com.lti.entity;

import java.time.LocalTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_slot")
public class Slot {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SLOT_AUTO_INCR")
	@SequenceGenerator(name = "SLOT_AUTO_INCR", sequenceName = "SLOT_AUTO_INCR", allocationSize = 1)
	@Column(name = "slotno")
	private String slotNo;
	@Column(name = "departuretime")
	private LocalTime departureTime;
	@Column(name = "arrivaltime")
	private LocalTime arrivalTime;
	@Column(name = "traveltime")
	private LocalTime travelTime;
	@Column(name = "day")
	private String day;

	public String getSlotNo() {
		return slotNo;
	}

	public void setSlotNo(String slotNo) {
		this.slotNo = slotNo;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LocalTime getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(LocalTime travelTime) {
		this.travelTime = travelTime;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

}
