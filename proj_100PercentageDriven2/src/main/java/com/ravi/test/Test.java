package com.ravi.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ravi.beans.Vehicle;
import com.ravi.config.Config;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext cts=new AnnotationConfigApplicationContext(Config.class);
		Vehicle v=cts.getBean("vehicle",Vehicle.class);
		v.jounery("Patna", "Bangalore");
		cts.close();
	}

}
