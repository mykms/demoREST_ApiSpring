package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.example.controller", "com.example.service"})
public class DemoApplication {

	//https://start.spring.io/
	//https://medium.com/@ziatheonlyone/spring-rest-api-part-1-configuring-spring-boot-project-intellij-idea-gradle-385d26e01429
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
