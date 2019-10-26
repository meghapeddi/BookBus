package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_city")
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "city_auto_incr")
	@SequenceGenerator(name = "city_auto_incr", sequenceName = "city_auto_incr", allocationSize = 1)
	@Column(name = "cityId")
	private int id;

	@Column(name = "cityName")
	private String city;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
