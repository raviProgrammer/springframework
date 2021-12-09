package com.ravi.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ravi.beans.WishMessage;
import com.ravi.config.Config;

public class Test {

	public static void main(String[] args) {
		// Create IOC container
		AnnotationConfigApplicationContext cts=new AnnotationConfigApplicationContext(Config.class);
		//get the target class object from IOC container
		WishMessage w=cts.getBean("wmg",WishMessage.class);
		String status=w.generate("Ravi");
		System.out.println(status);
		cts.close();
	}

}
