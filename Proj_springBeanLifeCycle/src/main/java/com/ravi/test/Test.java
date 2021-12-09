package com.ravi.test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ravi.bean.VoterDetail;
public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/ravi/cfgs/applicationContext.xml");
		VoterDetail check=ctx.getBean("vote",VoterDetail.class);
		System.out.println(check);
		ctx.close();
	}
}