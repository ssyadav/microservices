package com.satya.daanee.admin.adminservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AdminServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminServicesApplication.class, args);
	}
	
}
