package com.shopease.shopeaseeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ShopeaseEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopeaseEurekaServerApplication.class, args);
	}

}
