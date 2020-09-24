package GradleSpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Library {
    public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("detailbean.xml");
		System.out.println("XML Loaded");
		CustomerData data=context.getBean("first",CustomerData.class);
		CustomerData data1=context.getBean("second",CustomerData.class);
		CustomerData data2=context.getBean("third",CustomerData.class);
		System.out.println(data);
		System.out.println(data1);
		System.out.println(data2);
		((ClassPathXmlApplicationContext)context).close();
	}
}
