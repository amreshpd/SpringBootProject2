package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IDoctorService;

@Component
public class Test implements CommandLineRunner {
	@Autowired
	private IDoctorService repo;  //in memory proxy obj

	@Override
	public void run(String... args) throws Exception {
	/*	int k = repo.appraiseDoctorIncomeBySpecialization("Brain", 12.0);
		System.out.println(k+" Rows are updated"); */
		System.out.println("For delete operation");
		System.out.println("rows are deleted "+repo.fireDoctorByIncomeRange(40000.0, 57000.0));
		
	}
}
