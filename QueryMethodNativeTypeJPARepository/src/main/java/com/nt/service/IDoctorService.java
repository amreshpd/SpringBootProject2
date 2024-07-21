package com.nt.service;

import com.nt.entity.Doctor;

public interface IDoctorService {
    public int registerDoctorData(int docid,String name,String specialization,double income,long mobile,double percantage);	
}
