package com.hcl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

@Entity
public class Physician {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Size(min =1 , message = "please enter the firstname")
	private String firstName;
	@Size(min =1 , message = "please enter the lastname")
	private String lastName;
	@Size(min =1 , message = "please enter the department")
	private String department;
	@Size(min =1 , message = "please enter the education qualification")
	private String eduQualification;
	@Size(min =1 , message = "please enter the year of experience")
	private String yearsOfExperience;
	@Size(min =1 , message = "please enter the state")
	private String state;
	@Size(min =1 , message = "please enter the insurance plan")
	private String insurance;
	
	public Physician()
	{
		
	}
	public Physician(int id, String firstName, String lastName, String department, String eduQualification,
			String yearsOfExperience, String state, String insurance) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.eduQualification = eduQualification;
		this.yearsOfExperience = yearsOfExperience;
		this.state = state;
		this.insurance = insurance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEduQualification() {
		return eduQualification;
	}
	public void setEduQualification(String eduQualification) {
		this.eduQualification = eduQualification;
	}
	public String getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(String yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	
	
	
}
