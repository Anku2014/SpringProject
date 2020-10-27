package com.hcl.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.PatientDao;
import com.hcl.entity.Patient;
@Service
public class PatientServiceImpl implements PatientService {
	  @Autowired
	    private PatientDao dao;
	    @Override
	    @Transactional
	    public void insertPatient(Patient patient) {
	        dao.insert(patient);
	    }
	    @Transactional
	    public List<Patient> getAllPatient()
	    {
	        return dao.getAllPatient();
	       
	    }
}
