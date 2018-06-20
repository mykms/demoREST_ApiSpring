package com.example.startpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(value = {"com.example.controller", "com.example.service", "com.example.repository"})
@EntityScan(value = {"com.example.entity"})
@EnableJpaRepositories("com.example.repository")
public class MainApplication {

	//https://start.spring.io/
	//https://medium.com/@ziatheonlyone/spring-rest-api-part-1-configuring-spring-boot-project-intellij-idea-gradle-385d26e01429
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
}
