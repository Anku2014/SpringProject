package com.hcl.dao;

import java.util.List;

import com.hcl.entity.Patient;

public interface PatientDao {
	  public void insert(Patient patient);
	  public List<Patient> getAllPatient();
}
