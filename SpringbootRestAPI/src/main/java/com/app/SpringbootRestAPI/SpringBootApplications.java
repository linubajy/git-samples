package com.app.SpringbootRestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class SpringBootApplications 
{

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootApplications.class, args);
	}
	
}	
