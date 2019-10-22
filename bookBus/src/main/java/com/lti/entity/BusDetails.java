package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "tbl_Bus")
public class BusDetails {

	@Id
	@Column(name = "busno")
	private String busNo;
	@Column(name = "busname")
	private String busName;
	@Column(name = "src")
	private String src;
	@Column(name = "destination")
	private String destination;
	@Column(name = "slotno")
	private int slotNo;
	@Column(name = "type")
	private String type;
	@Column(name = "noofseats")
	private int noOfSeats;

	/*
	 * @OneToOne(mappedBy = "bus", cascade = CascadeType.ALL) private Fare fare;
	 * 
	 * public Fare getFare() { return fare; }
	 * 
	 * public void setFare(Fare fare) { this.fare = fare; }
	 */

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getSlotNo() {
		return slotNo;
	}

	public void setSlotNo(int slotNo) {
		this.slotNo = slotNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

}
