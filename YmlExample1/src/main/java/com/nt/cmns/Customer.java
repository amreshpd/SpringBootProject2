package com.nt.cmns;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cst")
@ConfigurationProperties(prefix = "cust.info")
@Data
public class Customer {
	 private Integer id;
	 private String name;
	 private Long mobile;
	 private String department;
}
