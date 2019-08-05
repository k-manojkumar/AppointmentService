package com.tcs.azure.ms.appointments;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.tcs.poc.service",
	"com.tcs.poc.controller",
	"com.tcs.poc.hibernate",
	"com.tcs.poc.pojo"})
public class AppointmentMSApplication extends SpringBootServletInitializer {

	protected SpringApplicationBuilder configure (SpringApplicationBuilder applicationBuilder) {
		return applicationBuilder.sources(AppointmentMSApplication.class);
	}
}
