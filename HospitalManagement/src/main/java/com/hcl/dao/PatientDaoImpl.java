package com.hcl.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hcl.entity.Patient;

@Repository
public class PatientDaoImpl implements PatientDao {
	@Autowired
	private SessionFactory factory;
	@Override
	public void insert(Patient patient) {
		factory.getCurrentSession().save(patient);
	}
	public List<Patient> getAllPatient()
    {
       
        List<Patient> patients=factory.getCurrentSession().createQuery("from com.hcl.entity.Patient").list();
    System.out.println(patients);
    return patients;
    }
}
