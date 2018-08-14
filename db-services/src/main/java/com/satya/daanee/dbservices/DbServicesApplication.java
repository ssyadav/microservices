package com.satya.daanee.dbservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EnableJpaRepositories(basePackages="com.satya.daanee.dbservices.repository")
@SpringBootApplication
public class DbServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbServicesApplication.class, args);
	}
}
