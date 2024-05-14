package com.raje;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.raje.dto.AccountsContactInfoDto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "RajeBank Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Kanhaiya raje",
						email = "rajekanhaiya@gmail.com ",
						url = "https://www.rajekanhaiya.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.rajekanhaiya.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "rajeBank Accounts microservice REST API Documentation",
				url = "https://www.rajekanhaiya.com/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
