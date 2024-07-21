package com.nt.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Test1Runner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Application Runner");
		System.out.println("Non Option Value: "+args.getNonOptionArgs());
		System.out.println("option and args value...");
		for(String name:args.getOptionNames()) {
			System.out.println(name+": "+args.getOptionValues(name));
		}
		
	}

}
