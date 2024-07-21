package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;


/*
  create or replace procedure P_GET_DOCTORS_BY_INCOME_RANGE(STARTINCOME IN FLOAT,
  2  ENDINCOME IN FLOAT,
  3  DETAILS OUT SYS_REFCURSOR)
  4  AS
  5  BEGIN
  6  OPEN DETAILS FOR
  7  SELECT * FROM JPA_DOCTOR WHERE INCOME>=STARTINCOME AND INCOME<=ENDINCOME;
  8  END P_GET_DOCTORS_BY_INCOME_RANGE;
  9  / 
 
 */

@Service("doctorService")
public class DoctorMgmtServiceImpl implements IDoctorMgmtService {
	
	@Autowired
	private EntityManager manager;  // dynamically created procedure
	
	@Override
	public List<Doctor> showDoctorByIncome(Double start, Double end) {
	// created stored procedures query object pointing plsql procedure
		StoredProcedureQuery storedDocterDataProcedure = manager.createStoredProcedureQuery("P_GET_DOCTORS_BY_INCOME_RANGE",Doctor.class);
		// register both IN,OUT params
		storedDocterDataProcedure.registerStoredProcedureParameter(1, Double.class,ParameterMode.IN);
		storedDocterDataProcedure.registerStoredProcedureParameter(2, Double.class,ParameterMode.IN);
		storedDocterDataProcedure.registerStoredProcedureParameter(3, Object.class,ParameterMode.REF_CURSOR);  // OUTPUT in the cursor mode
		// set values to IN params
		storedDocterDataProcedure.setParameter(1,start);
		storedDocterDataProcedure.setParameter(2,end);
		//call PL/SQL procedure
		List<Doctor> list=storedDocterDataProcedure.getResultList();   // getThe all data		
		return list;
	}

}
