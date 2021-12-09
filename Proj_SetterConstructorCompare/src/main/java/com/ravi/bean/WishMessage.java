package com.ravi.bean;

import java.util.Date;

public class WishMessage {
	// HAS-A Properties(Composition)
	private Date date;
	public WishMessage() {
		System.out.println("WishMessage zero constructor:");
	}
	public void setDate(Date date) {
		System.out.println("Setter injection");
		this.date = date;
	}
	public WishMessage(Date date) {
		System.out.println("WishMessage Single constructor:");
		this.date = date;
	}
	// Business Method
	public String generateMessage(String user) {
		System.out.println("Output date is:"+date);
		// get current of the day.
		int hour=date.getHours();
		if(hour<12)
			return "Good Morning:"+user;
		else if(hour<16)
			return "Good AfterNoon:"+user;
		else if(hour<20)
			return "Good Evening:"+user;
		else
			return "Good Night:"+user;
	}
}
