package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.emp.Employee;

@SpringBootApplication
public class YmlExample12Application {

	public static void main(String[] args) {
		ApplicationContext ctx=
		SpringApplication.run(YmlExample12Application.class, args);
		Employee e = ctx.getBean("emp",Employee.class);
	System.out.println(e);
	}

}
