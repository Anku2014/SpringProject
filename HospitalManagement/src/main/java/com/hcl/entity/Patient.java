package com.hcl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@Size(min =1 , message = "please enter the firstname")
	private String firstName;
	@Size(min =1 , message = "please enter the lastname")
	private String lastName;
	@Size(min =5 , message = "please enter password")
	private String password;
	@Size(min =1 , message = "please enter the Date of Birth")
	private String dateOfBirth;
	@Size(min =5 , message = "please enter the email")
	private String email;
	@Size(min =8 , message = "please enter the contact number")
	private String contactNumber;
	@Size(min =3 , message = "please enter the state")
	private String state;
	@Size(min =1 , message = "please enter the insurance plan")
	private String insurancePlan;
	public Patient() {
	}
	public Patient(int pid, String firstName, String lastName, String password, String dateOfBirth, String email,
			String contactNumber, String state, String insurancePlan) {
		super();
		this.pid = pid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.contactNumber = contactNumber;
		this.state = state;
		this.insurancePlan = insurancePlan;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getInsurancePlan() {
		return insurancePlan;
	}
	public void setInsurancePlan(String insurancePlan) {
		this.insurancePlan = insurancePlan;
	}
	
	
	
	}


