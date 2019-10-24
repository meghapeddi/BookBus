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
@Table(name = "tbl_busdetails")
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
	@Column(name = "type")
	private String type;
	@Column(name = "departuretime")
	private String departureTime;
	@Column(name = "arrivaltime")
	private String arrivalTime;
	@Column(name = "traveltime")
	private String travelTime;
	@Column(name="fare")
	private int fare;
	
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getTravelTime() {
		return travelTime;
	}
	public void setTravelTime(String travelTime) {
		this.travelTime = travelTime;
	}
}
