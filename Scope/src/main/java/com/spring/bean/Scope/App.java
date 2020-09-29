package com.spring.bean.Scope;

import java.util.ArrayList;
import java.util.Arrays;

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
       ApplicationContext context=new ClassPathXmlApplicationContext("scopetest.xml");
       Employee scope = (Employee) context.getBean("scopeTest");
       Employee scopeDuplicate = (Employee) context.getBean("scopeTestDuplicate");
       System.out.println(scope == scopeDuplicate);
       System.out.println(scope + "::" + scopeDuplicate);
       ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
       list.forEach(i -> System.out.print(i+" "));
    }
}
