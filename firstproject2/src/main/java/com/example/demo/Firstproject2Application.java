package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="INSTAGRAM",
				version="1.1.2",
				description="Insta user details",
				contact=@Contact(
						name="Vasundhra V",
						email="vasundhravinayagam@gmail.com"
						)
				)	
		)
public class Firstproject2Application {

	public static void main(String[] args) {
		SpringApplication.run(Firstproject2Application.class, args);
	}

}
