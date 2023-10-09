package com.test.springStudying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ExternalPackage")
public class SpringStudyingApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringStudyingApplication.class, args);
	}

}
