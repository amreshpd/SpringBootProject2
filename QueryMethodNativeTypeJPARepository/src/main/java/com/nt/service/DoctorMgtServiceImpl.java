package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepo;

@Service("Dct")
public class DoctorMgtServiceImpl implements IDoctorService {
	
	@Autowired
	public IDoctorRepo doctRepo;

	@Override
	public int registerDoctorData(int docid,String name, String specialization, double income,long mobile,double percantage) {
		int k = doctRepo.registerDoctor(docid,name, specialization, income,mobile,percantage);
		return k;
	}

		
		
}
