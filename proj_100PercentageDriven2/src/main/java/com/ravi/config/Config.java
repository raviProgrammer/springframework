package com.ravi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ravi.beans")
public class Config {
	public Config() {
		System.out.println("Config Zero param Constructor:");
	}

}
