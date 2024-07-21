package com.nt.service;

import com.nt.entity.Doctor;

public interface IDoctorService {
	public int appraiseDoctorIncomeBySpecialization(String sp,double percantage);
	public int fireDoctorByIncomeRange(double start,double end);
}
