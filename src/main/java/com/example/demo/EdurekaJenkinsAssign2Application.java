package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EdurekaJenkinsAssign2Application extends SpringBootServletInitializer   {
	@Override  
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)   
	{  
	return application.sources(EdurekaJenkinsAssign2Application.class);  
	}  
	public static void main(String[] args) {
		SpringApplication.run(EdurekaJenkinsAssign2Application.class, args);
	}

}
