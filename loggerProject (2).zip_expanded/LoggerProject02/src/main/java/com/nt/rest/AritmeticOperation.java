package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AritmeticOperation {
	
	@GetMapping("/div")
	public String div() {
		log.debug("Arithmetic operation started.....");
		log.info("div() object created");
		try {
			log.info("performing Arithmetic operation...");
			float result=100/0;
			log.info("Arithmetic operation completed...");
			return result+" ";
		}catch (Exception e) {
			e.printStackTrace();
		log.error("problem in arithmetic operation::"+e.getMessage());
		return "Result is::"+e.getMessage();
		}
	}
}
