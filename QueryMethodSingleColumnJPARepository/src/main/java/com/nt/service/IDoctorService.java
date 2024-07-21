package com.nt.service;

import com.nt.entity.Doctor;

public interface IDoctorService {
	public Doctor searchDoctorByName(String name);
	public Object searchDoctorMultipleColumn(String name);
	public String searchDoctorSpecialization(String name);
}
