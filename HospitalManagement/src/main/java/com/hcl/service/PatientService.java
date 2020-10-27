package com.hcl.service;

import java.util.List;

import com.hcl.entity.Patient;

public interface PatientService {
	 public void insertPatient(Patient patient);
	 public List<Patient> getAllPatient();
}
