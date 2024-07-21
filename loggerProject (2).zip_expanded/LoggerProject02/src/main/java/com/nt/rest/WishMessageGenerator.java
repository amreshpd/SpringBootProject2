package com.nt.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //(@controller + @ResponseBody)
public class WishMessageGenerator {
	private static Logger logger=LoggerFactory.getLogger(WishMessageGenerator.class);
	
	
	@GetMapping("/greet")
	public ResponseEntity<String> showWish(){
		logger.trace("Start the show wish() method....");
		logger.info("At the start of the wishmessage() method");
		String msg="Good night";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
}
