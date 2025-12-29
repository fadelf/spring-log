package com.delfa.springbootlogging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootloggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootloggingApplication.class, args);
	}

}
