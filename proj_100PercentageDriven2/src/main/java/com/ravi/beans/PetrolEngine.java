package com.ravi.beans;

import org.springframework.stereotype.Component;

@Component("petrol")
public final class PetrolEngine implements Engine {

	@Override
	public void start() {
		System.out.println("petrol engine start:");

	}

	@Override
	public void stop() {
		System.out.println("petrol engine start:");

	}

	public PetrolEngine() {
		System.out.println("petrol engine zero param construtor:");
	}

}
