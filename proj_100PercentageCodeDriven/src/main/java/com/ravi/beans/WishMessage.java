package com.ravi.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wmg")
public class WishMessage {
	@Autowired
	private LocalDateTime ldt;
	public String generate(String user) {
		int h=ldt.getHour();
		if(h<12)
			return "Good Morning:"+user;
		else if(h<16)
				return "Good AfterNoon:"+user;
		else if(h<20)
				return "Good Evening:"+user;
		else
			return "Good Night:"+user;
	}
}
