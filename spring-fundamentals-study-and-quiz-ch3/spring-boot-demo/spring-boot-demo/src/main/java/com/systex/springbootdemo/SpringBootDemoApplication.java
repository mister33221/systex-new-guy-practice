package com.systex.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootDemoApplication extends SpringBootServletInitializer {
	// SpringBootServletInitializer is used to configure the application when it is deployed to a servlet container such as Apache Tomcat, JBoss or Oracle WebLogic Server.
	// SpringApplicationBuilder is used to create an application context.
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootDemoApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
