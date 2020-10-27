package com.hcl.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.entity.PatientDiagnosis;
@Repository
public class PatientDiagnosisImpl implements PatientDiagnosisDao {
	@Autowired
	private SessionFactory factory;
	@Override
	public void insert(PatientDiagnosis patientDiagnosis) {
		factory.getCurrentSession().save(patientDiagnosis);

	}

}
