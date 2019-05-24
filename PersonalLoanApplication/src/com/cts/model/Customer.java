package com.cts.model;

import java.sql.Date;

public class Customer {
	private int customerId;
	private String firstName;
	private String LastName;
	private long mobileNumber;
	private String email;
	private java.util.Date dob;
	private String panCardNumber;
	private long aadharNumber;
	private String password;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPanCardNumber() {
		return panCardNumber;
	}
	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	
	public java.util.Date getDob() {
		return dob;
	}
	public void setDob(java.util.Date dob2) {
		this.dob = dob2;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String firstName, String lastName, long mobileNumber, String email,Date dob,
			String panCardNumber, long aadharNumber,String password) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		LastName = lastName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.dob=dob;
		this.panCardNumber = panCardNumber;
		this.aadharNumber = aadharNumber;
		this.password=password;
		
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", LastName=" + LastName
				+ ", mobileNumber=" + mobileNumber + ", email=" + email + ", dob=" + dob +" panCardNumber=" + panCardNumber
				+ ", aadharNumber=" + aadharNumber + ", password=" + password +"]";
	}
 
}