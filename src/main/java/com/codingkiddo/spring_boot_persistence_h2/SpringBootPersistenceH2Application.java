package com.codingkiddo.spring_boot_persistence_h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-h2.properties")
public class SpringBootPersistenceH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPersistenceH2Application.class, args);
	}

}
