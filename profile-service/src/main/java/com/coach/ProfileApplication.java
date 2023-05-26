package com.coach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * This is a Java Spring Boot application that enables Eureka client, Feign clients, Hystrix and
 * Hystrix dashboard.
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class ProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileApplication.class, args);
	}

}