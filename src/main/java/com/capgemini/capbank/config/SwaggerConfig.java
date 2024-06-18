package com.capgemini.capbank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI openAPI() {
		
		return new OpenAPI()
				.info(new Info().title("Capgemini Bank")
				.description("")
				.version("")
				.contact(new Contact().name("Monali Aich").email("monaliaich@capgemini.com"))
				.license(new License().name("Apache 2.0").url("http://springdoc.org"))
				).externalDocs(new ExternalDocumentation()
						.description("A bank to manage accounts, including opening an account with an option to add initial credit, retrieving account balance, retrieving person information, and making transfers between accounts.")
						.url("https://github.com/monaliaich/Api-Engineering"));
		
	}
}
