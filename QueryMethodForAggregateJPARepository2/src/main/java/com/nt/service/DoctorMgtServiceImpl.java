package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.repository.IDoctorRepo;

@Service("Dct")
public class DoctorMgtServiceImpl implements IDoctorService {
	
	@Autowired
	public IDoctorRepo doctRepo;

	@Override
	public int showTotalDocName() {
		int k = doctRepo.fetchDoctorNameCount();
		return k;
	}

	@Override
	public Object showAggreagateData() {
		Object obj = doctRepo.fetchAggregateData();
		return obj;
	}
		
}
