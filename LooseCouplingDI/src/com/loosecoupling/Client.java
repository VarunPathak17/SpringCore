package com.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
//	    done through Dependency Injection..
		ApplicationContext context=new ClassPathXmlApplicationContext("main.xml");
		System.out.println("   ------Xml Loaded------   ");
		Student s1=context.getBean("stud",Student.class);
		s1.cheating();
	}

}
