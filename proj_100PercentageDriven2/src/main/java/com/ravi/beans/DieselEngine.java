package com.ravi.beans;

import org.springframework.stereotype.Component;

@Component("diesel")
public final class DieselEngine implements Engine {

	public DieselEngine() {
		System.out.println("Diesel zero param Constructor ");
	}

	@Override
	public void start() {
		System.out.println("Diesel engine start:");
	}

	@Override
	public void stop() {
		System.out.println("Diesel engine stop:");
	}

}
