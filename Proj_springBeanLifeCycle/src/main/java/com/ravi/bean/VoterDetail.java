package com.ravi.bean;
import java.util.Date;
public class VoterDetail {
	private String name;
	private String address;
	private int age;
	private Date date;
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// custom method
	public void myinit() {
		System.out.println("myinit method:");
		if(age<=0 || age>=120)
			throw new IllegalArgumentException("please put Age value 1 to 119 year:");
		if(name==null)
			throw new IllegalArgumentException("please put the your Name:");
		if(address==null)
			throw new IllegalArgumentException("please put the address:");
		date=new Date();
	}
	
	@Override
	public String toString() {
		if(age<18)
			return "You are not eligible to vote proceess";
		else
			return "VoterDetail:"+"name:"+name+",address:"+address+",age"+age+",date:"+date;
	}
	public void myDestory() {
		System.out.println("myDestroy Method:");
		age=0;
		address=null;
		name=null;
		date=null;
	}
}
