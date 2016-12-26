package com.vtcmer.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsEurekaRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEurekaRegistrationApplication.class, args);
	}
}
