package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Company;

@SpringBootApplication
public class PropertiesBulkInjectionArrayApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=
		SpringApplication.run(PropertiesBulkInjectionArrayApplication.class, args);
	Company c = ctx.getBean("cmp",Company.class);
	System.out.println(c);
	}

}
