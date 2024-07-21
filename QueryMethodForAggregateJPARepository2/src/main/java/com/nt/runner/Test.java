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
	System.out.println("Total no of docName...");
	System.out.println("total no of docName:"+repo.showTotalDocName());
	
	System.out.println("Multiple object print at a time..........");	
	Object []result=(Object[])repo.showAggreagateData();
	System.out.println("record Maximum income is: "+result[0]);
	System.out.println("record Total count is: "+result[1]);
	System.out.println("record Minimum Income is: "+result[2]);
	System.out.println("record Average Income is: "+result[3]);
	System.out.println("record Sum of income is: "+result[4]);
	}
}
