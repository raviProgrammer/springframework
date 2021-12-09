package com.ravi.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ravi.bean.WishMessage;

public class Test {

	public static void main(String[] args) {
		// Locate and hold spring configure file & location
		FileSystemResource res=new FileSystemResource("src/main/java/com/ravi/cfgs/applicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		// IOC container to give target spring bean class object
		Object obj=factory.getBean("wm");
		// type casting because not direct call to super class
		WishMessage g=(WishMessage)obj;
		String result=g.generateMessage("Ravi Prasad");
		System.out.println(result);
		
	}

}
