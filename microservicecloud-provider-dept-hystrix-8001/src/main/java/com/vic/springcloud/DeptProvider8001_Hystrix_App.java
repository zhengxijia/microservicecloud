package com.vic.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker//对hustrix熔断器的支持
public class DeptProvider8001_Hystrix_App {
	
	public static void main(String []args){
		SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
	}
}
