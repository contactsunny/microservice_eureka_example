package com.contactsunny.poc.eureka_microservice_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMicroserviceExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMicroserviceExampleApplication.class, args);
	}

}
