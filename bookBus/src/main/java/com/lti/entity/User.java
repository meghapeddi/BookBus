package com.lti.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_AUTO_INCR")
	@SequenceGenerator(name = "USER_AUTO_INCR", sequenceName = "USER_AUTO_INCR", allocationSize = 1)
	@Column(name = "userid")
	private int userId;
	@Column(name = "fname")
	private String fname;
	@Column(name = "lname")
	private String lname;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "contactno")
	private String contactno;
	@Column(name = "gender")
	private String gender;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private Set<PassengerDetails> passengerDetails;

	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private Set<Booking> booking;

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String string) {
		this.contactno = string;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
