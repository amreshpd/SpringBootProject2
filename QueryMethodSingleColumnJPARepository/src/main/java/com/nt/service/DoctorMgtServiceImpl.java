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
	public Doctor searchDoctorByName(String name) {
		Doctor doc = doctRepo.showDoctorInfoByName(name).orElseThrow(()->new IllegalArgumentException("Doctor not found"));
		return doc;
	}
	@Override
	public Object searchDoctorMultipleColumn(String name) {
		Object obj = doctRepo.showDoctorDataByName(name);
		return obj;
	}
	@Override
	public String searchDoctorSpecialization(String name) {
		String show = doctRepo.showSpecializationByName(name);
		return show;
	}
	
		
}
