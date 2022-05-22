package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "register")
public class SignUpModel {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid")
	private int userID;
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	@Column(name = "username")
	private String userName;
	public SignUpModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SignUpModel(int userID, String email, String password, String userName) {
		super();
		this.userID = userID;
		this.email = email;
		this.password = password;
		this.userName = userName;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserID() {
		return userID;
	}
	

}
