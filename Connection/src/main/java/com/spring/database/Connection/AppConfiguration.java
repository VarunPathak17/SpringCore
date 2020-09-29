package com.spring.database.Connection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.spring.database.Connection")
@PropertySource("classpath:details.properties")
public class AppConfiguration {	
}
