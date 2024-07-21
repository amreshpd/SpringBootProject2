package com.nt.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorService;

@Component
public class Test implements CommandLineRunner {
	@Autowired
	private IDoctorService repo; // in memory proxy obj

	@Override
	public void run(String... args) throws Exception {
		System.out.println("rows are inserted " + repo.registerDoctorData(1,"Amresh","Heart",70.0, 78457945L,45786.0));
	}
}
