package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.cmns.Customer;

@SpringBootApplication
public class YmlExample1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=
				SpringApplication.run(YmlExample1Application.class, args);
		Customer cst = ctx.getBean("cst",Customer.class);
		System.out.println(cst);
	}
}
