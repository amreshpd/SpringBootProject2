package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nt.service.Loginmgmt;

public class TestRunner implements CommandLineRunner {
	
	@Autowired
	private Loginmgmt lmg;
	@Override
	public void run(String... args) throws Exception {
		boolean log = lmg.login("", "");
		System.out.println("login ?"+log);
	}

}
