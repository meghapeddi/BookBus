package com.lti.dto;

import java.time.LocalDate;

import com.lti.entity.Gender;

public class UserDTO {

	private String fname;
	private String lname;
	private String email;
	private String password;
	private int contactno;
	private Gender gender;
	

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

	public int getContactNo() {
		return contactno;
	}

	public void setContactNo(int contactNo) {
		contactno = contactno;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	
}
