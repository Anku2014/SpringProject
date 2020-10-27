package com.hcl.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.Size;

@Entity
public class PatientDiagnosis {
	
private int patientId;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int did;
@Size(min =1 , message = "please enter the symptoms")
private String symptoms;
@Size(min =1 , message = "please enter the diagnosis")
private String diagnosis;
@Size(min =1 , message = "please enter the physician name")
private String physicianName;
@Size(min =1 , message = "please enter the date of diagnosis")
private String dateOfDiagnosis;
@Size(min =1 , message = "please enter the follow up")
private String followUp;
@Size(min =1 , message = "please enter the date of follow up")
private String DateOfFollowUp;

private Long BillAmount;

private Long cardNumber;
@Size(min =1 , message = "please enter the mode")
private String mode;
public PatientDiagnosis()
{
	
}
public PatientDiagnosis(int patientId, int did, String symptoms, String diagnosis, String physicianName,
		String dateOfDiagnosis, String followUp, String dateOfFollowUp, Long billAmount, Long cardNumber, String mode) {
	super();
	this.patientId = patientId;
	this.did = did;
	this.symptoms = symptoms;
	this.diagnosis = diagnosis;
	this.physicianName = physicianName;
	this.dateOfDiagnosis = dateOfDiagnosis;
	this.followUp = followUp;
	this.DateOfFollowUp = dateOfFollowUp;
	this.BillAmount = billAmount;
	this.cardNumber = cardNumber;
	this.mode = mode;
}


public int getPatientId() {
	return patientId;
}
public void setPatientId(int patientId) {
	this.patientId = patientId;
}
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getSymptoms() {
	return symptoms;
}
public void setSymptoms(String symptoms) {
	this.symptoms = symptoms;
}
public String getDiagnosis() {
	return diagnosis;
}
public void setDiagnosis(String diagnosis) {
	this.diagnosis = diagnosis;
}

public String getDateOfDiagnosis() {
	return dateOfDiagnosis;
}
public void setDateOfDiagnosis(String dateOfDiagnosis) {
	this.dateOfDiagnosis = dateOfDiagnosis;
}
public String getFollowUp() {
	return followUp;
}
public void setFollowUp(String followUp) {
	this.followUp = followUp;
}
public String getDateOfFollowUp() {
	return DateOfFollowUp;
}
public void setDateOfFollowUp(String dateOfFollowUp) {
	DateOfFollowUp = dateOfFollowUp;
}
public Long getBillAmount() {
	return BillAmount;
}
public void setBillAmount(Long billAmount) {
	BillAmount = billAmount;
}
public Long getCardNumber() {
	return cardNumber;
}
public void setCardNumber(Long cardNumber) {
	this.cardNumber = cardNumber;
}
public String getMode() {
	return mode;
}
public void setMode(String mode) {
	this.mode = mode;
}
public String getPhysicianName() {
	return physicianName;
}
public void setPhysicianName(String physicianName) {
	this.physicianName = physicianName;
}


}
