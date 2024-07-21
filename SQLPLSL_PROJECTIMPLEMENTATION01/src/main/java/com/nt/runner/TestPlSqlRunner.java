package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorMgmtService;

@Component
public class TestPlSqlRunner implements CommandLineRunner {
	@Autowired
	private IDoctorMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
	List<Doctor> list = service.showDoctorByIncome(10000.0, 100000.0);
	list.forEach(System.out::println);
	}

}
