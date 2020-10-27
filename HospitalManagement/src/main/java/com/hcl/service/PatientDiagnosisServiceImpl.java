package com.hcl.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.PatientDiagnosisDao;
import com.hcl.entity.PatientDiagnosis;
@Service
public class PatientDiagnosisServiceImpl implements PatientDiagnosisService {
	@Autowired
	private PatientDiagnosisDao dao;
	@Override
	@Transactional
	public void insertPatientDiagnosis(PatientDiagnosis patientDiagnosis) {
		dao.insert(patientDiagnosis);

	}

}
