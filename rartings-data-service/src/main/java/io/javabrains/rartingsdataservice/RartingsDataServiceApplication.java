package io.javabrains.rartingsdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RartingsDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RartingsDataServiceApplication.class, args);
	}

}
