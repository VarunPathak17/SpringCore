package com.java.inversion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile 
{
	public static void main(String []args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("Config Loaded");
		Simcard air=context.getBean("sim",Simcard.class);
		air.calling();
		air.data();
	}
}
