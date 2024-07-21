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
	public int appraiseDoctorIncomeBySpecialization(String sp, double percantage) {
		int k = doctRepo.hikeDoctorsIncomeBySpecialization(sp, percantage);
		return k;
	}

	@Override
	public int fireDoctorByIncomeRange(double start, double end) {
	int k = doctRepo.removeDoctorByIncomeRange(start, end);
		return k;
	}

		
		
}
