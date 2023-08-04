package com.mercedesbenz.carservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Car Travel Booking API Documentation",
				description = "API Documentation for endpoints to book a car for your travel",
				version = "1.0",
				contact = @Contact(
						name = "Pablo Sánchez Bello",
						email = "pablo.sanchez_bello@mercedes-benz.com",
						url = "https://mbinside.app.corpintra.net/person/SANCHPA"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://mercedes-benz.com"
				)
		)
)
public class CarServiceApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(CarServiceApplication.class, args);
	}

}
