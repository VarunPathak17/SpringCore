package com.spring.customer.Data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("customerdetails.xml");
       System.out.println("Getting Data From XML");
       CustomerData data1=context.getBean("cust1",CustomerData.class);
       CustomerData data2=context.getBean("cust2",CustomerData.class);
       System.out.println(data1);
       System.out.println(data2);
    }
}
