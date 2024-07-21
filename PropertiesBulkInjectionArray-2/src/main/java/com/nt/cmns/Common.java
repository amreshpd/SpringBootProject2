package com.nt.cmns;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cmn")
@Data
@ConfigurationProperties(prefix = "org.nt")
public class Common {
	private String []branches;
	private List<String> owners;
	private Set<Long> phones;
	private Map<String, Object> idDetails;
	private License license;
}
