package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "adminId", updatable = false, nullable = false)
	private int id;
	
	@Column(name="username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
}
