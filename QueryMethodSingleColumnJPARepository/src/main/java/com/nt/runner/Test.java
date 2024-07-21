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
	private IDoctorService repo;  //in memory proxy obj

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Select through optional....");
    Doctor doc = repo.searchDoctorByName("Devika");
    System.out.println("Doctor record are: "+doc);
    System.out.println(".........Object Through single id and multiple column fetch at a time...........");
    Object obj = repo.searchDoctorMultipleColumn("sarkar");
    Object data[]=(Object[])obj;
    System.out.println(Arrays.toString(data));
    System.out.println("..........Single row and single value.........");
    String spec = repo.searchDoctorSpecialization("Devika");
    System.out.println("doctor are specialization for: "+spec);
    
	}
}
