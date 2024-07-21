package com.nt.emp;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@Data
@ConfigurationProperties(prefix = "emp.nt")
public class Employee {
	//simple Properties
	private String name;
	private Integer id;
	
	//array type
	private String []favcolors;
	//list
	private List<String> nickName;
	//set
	private Set<Long> contacts;
	//Map
	private Map<String,Object> idDetails;
	//Has-A-Property
	private Company company;
}
