package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_stops")
public class Stops {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stops_auto_incr")
	@SequenceGenerator(name = "stops_auto_incr", sequenceName = "stops_auto_incr", allocationSize = 1)
	@Column(name = "stopId")
	private int stopId;

	@Column(name = "city")
	private String city;

	@Column(name = "stopName")
	private String stopName;

	public int getStopId() {
		return stopId;
	}

	public void setStopId(int stopId) {
		this.stopId = stopId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStopName() {
		return stopName;
	}

	public void setStopName(String stopName) {
		this.stopName = stopName;
	}

}