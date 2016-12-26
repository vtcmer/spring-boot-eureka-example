package com.vtcmer.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.vtcmer.spring.boot.controller.UserController;
import com.vtcmer.spring.boot.repository.UserRepository;
import com.vtcmer.spring.boot.repository.impl.UserRepositoryImpl;
import com.vtcmer.spring.boot.services.UserService;
import com.vtcmer.spring.boot.services.impl.UserServiceImpl;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(useDefaultFilters = false) // Disable component scanner
public class MsClientUserApplication {

	public static final String SERVICE_URL = "http://USER-SERVICE";
	
	public static void main(String[] args) {
		SpringApplication.run(MsClientUserApplication.class, args);
	}
	
	@LoadBalanced
	@Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
	
	@Bean
	UserRepository getUserRepository(){
		return new UserRepositoryImpl(SERVICE_URL);
	}
	
	@Bean
	UserService getUserService(){
		return new UserServiceImpl();
	}
	
	 @Bean
    public UserController getUserController() {
        return new UserController();
    }
}
