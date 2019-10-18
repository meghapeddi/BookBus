package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class User {
	@Id
	private int userId;
	@Column(name = "fname")
	private String fname;
	@Column(name = "lname")
	private String lname;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "contact")
	private int contact;
	@Column(name = "dob")
	private LocalDate dob;
	@Column(name = "gender")
	private Gender gender;

}
