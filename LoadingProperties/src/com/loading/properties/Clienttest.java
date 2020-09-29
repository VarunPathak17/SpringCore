package com.loading.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Clienttest {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext context=new ClassPathXmlApplicationContext("autowire.xml");
	Student s1=context.getBean("student",Student.class);
	s1.display();
	s1.jdbc();
}
}
