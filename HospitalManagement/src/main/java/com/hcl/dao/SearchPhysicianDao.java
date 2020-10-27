package com.hcl.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hcl.entity.Physician;

@Component
public class SearchPhysicianDao {
	@Autowired
	SessionFactory factory;
	
	@Transactional
	public Physician searchName(String state) 
	{
		Session session= factory.getCurrentSession();
		Query q1=session.createQuery("from Physician where state= :s");
		q1.setParameter("s", state);
		
		
		try 
		{
			Physician temp= (Physician) q1.uniqueResult();
			System.out.println("in SearchPhysicianDao-state: found= "+temp);
			return temp;
		}
		catch(Exception e)
		{ 
			System.out.println("in SearchPhysicianDao-searchState: "+e);
			return null;
		}
			
	}
	
	@Transactional
	public Physician searchInsurancePlan(String insurance) 
	{
		
		
		Session session= factory.getCurrentSession();
		Query q1=session.createQuery("from Physician where insurance= :insurance");
		q1.setParameter("insurance", insurance);
		
		try 
		{
			Physician temp= (Physician) q1.uniqueResult();
			System.out.println("in SearchPhysicianDao-searchPlan: found= "+temp);
			return temp;
		}
		catch(Exception e)
		{ 
			System.out.println("in SearchPhysicianDao-searchState: "+e);
			return null;
		}		
	}

	@Transactional
	public Physician searchDepartment(String department) 
	{
		
		
		Session session= factory.getCurrentSession();
		Query q1=session.createQuery("from Physician where department= :department");
		q1.setParameter("department", department);
		
		try 
		{
			Physician temp= (Physician) q1.uniqueResult();
			System.out.println("in SearchPhysicianDao-searchDepartment: found= "+temp);
			return temp;
		}
		catch(Exception e)
		{ 
			System.out.println("in SearchPhysicianDao-searchDepartment: "+e);
			return null;
		}	
	}
}
