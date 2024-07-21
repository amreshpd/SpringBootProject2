package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IDoctorRepo;

@Component
public class Test implements CommandLineRunner {
	@Autowired
	private IDoctorRepo repo;  //in memory proxy obj

	@Override
	public void run(String... args) throws Exception {
    repo.searchDoctorByIncomeRange(10000.0, 950000.0).forEach(System.out::println);
		
		
	}
}
