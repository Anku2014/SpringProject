package com.hcl.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.PhysicianDao;
import com.hcl.entity.Physician;
@Service
public class PhysicianServiceImpl implements PhysicianService {
	@Autowired
	private PhysicianDao dao;
	@Override
	@Transactional
	public void insertPhysician(Physician physician) {
		dao.insert(physician);

	}

}
