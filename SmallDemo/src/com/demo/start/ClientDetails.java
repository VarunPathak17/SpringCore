package com.demo.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDetails {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("customerdata.xml");
		Customer c1=context.getBean("cust1",Customer.class);
		System.out.println("First "+c1);
		Customer c2=context.getBean("cust2",Customer.class);
		System.out.println("Second "+c2);
		Customer c3=context.getBean("cust3",Customer.class);
		System.out.println("Third "+c3);
		ClassPathXmlApplicationContext ctx=(ClassPathXmlApplicationContext)context;
		ctx.close();
	}
}
