package com.java.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Student First=context.getBean("student",Student.class);
		First.displayStudentInfo();
		Student dilip=context.getBean("dilip",Student.class);
		dilip.displayStudentInfo();
		ClassPathXmlApplicationContext ctx=(ClassPathXmlApplicationContext)context;
		ctx.close();
	}
}
