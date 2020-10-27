package com.hcl.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Physician;
@Repository
public class PhysicianDaoImpl implements PhysicianDao {
	@Autowired
	private SessionFactory factory;
	@Override
	public void insert(Physician physician) {
		factory.getCurrentSession().save(physician);

	}

}
