package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component("cmp")
@Data
@ToString
@NoArgsConstructor
@ConfigurationProperties(prefix = "org.nit")
@PropertySource("app.properties")
public class Company {
   private String name;
   private String addrs;
   private Integer pincode;
   private Long mobile;
   
   @Value("${org.nit.name1}")
   private String name1;
}
