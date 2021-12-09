package com.CoranaDetails;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class App {
	
	public static String getData(String input)throws Exception {
		StringBuffer sb=new StringBuffer();
		String url="https://www.worldometers.info/coronavirus/country/"+input+"/";
		Document doc=Jsoup.connect(url).get();
		// #maincounter-wrap(# means id in CSS format)
		Elements element=doc.select("#maincounter-wrap");
		element.forEach(e->{
			String text=e.select("h1").text(); 
			  // .maincounter-number(. means class in CSS format)
			  String value=e.select(".maincounter-number>span").text();
			  sb.append(text).append(" ").append(value).append("\n");
		});
		return sb.toString();
	}
	
    public static void main( String[] args ){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Country Name: ");
		String name=s.nextLine();
		try {
			System.out.println(getData(name));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
    }
}
