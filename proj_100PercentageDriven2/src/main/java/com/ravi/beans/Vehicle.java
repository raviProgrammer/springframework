package com.ravi.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public final class Vehicle {
	@Autowired
	@Qualifier("diesel")
	private Engine engg;
	public Vehicle() {
		System.out.println("Vehicle Zero param Constructor:");
	}
	public void jounery(String Initial, String End) {
		engg.start();
		System.out.println("jounery is started:"+Initial);
		engg.stop();
		System.out.println("jounery is stoped:"+End);
	}
}

