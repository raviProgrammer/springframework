package com.ravi.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ravi.beans")
public class Config {
	@Bean(name="sysDate")
	public LocalDateTime createLdt() {
		System.out.println("Local Time is:"+LocalDateTime.now());
		return LocalDateTime.now();
	}
}
