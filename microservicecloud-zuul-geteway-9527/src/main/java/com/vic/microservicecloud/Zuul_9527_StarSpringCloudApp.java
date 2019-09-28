package com.vic.microservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_StarSpringCloudApp {

	public static void main(String[] args) {
		SpringApplication.run(Zuul_9527_StarSpringCloudApp.class, args);
	}

}
