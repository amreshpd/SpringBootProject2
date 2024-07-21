package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.cmns.Common;

@SpringBootApplication
public class PropertiesBulkInjectionArray2Application {

	public static void main(String[] args) {
		ApplicationContext ctx=
		SpringApplication.run(PropertiesBulkInjectionArray2Application.class, args);
	Common c1 = ctx.getBean("cmn",Common.class);
	System.out.println(c1);
	}

}
