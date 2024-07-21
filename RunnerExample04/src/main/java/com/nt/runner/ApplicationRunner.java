package com.nt.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(10)
public class ApplicationRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		for(String a:args) {
			System.out.println(a);
		}
		
	}

}
