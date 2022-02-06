package com.bytetraining.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Admin {
	@Id
	@Column(name = "username", nullable = false, length = 20)
	private String username;
	
	@Column(name = "password", nullable = false, length = 20)
	private String password;
	
	@Column(name = "name", nullable = false, length = 20)
	private String name;
	
	@Column(name = "email", nullable = false, length = 20)
	private String email;
	
	@Column(name = "phoneNo", nullable = false, length = 10)
	private String phoneNo;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
}
