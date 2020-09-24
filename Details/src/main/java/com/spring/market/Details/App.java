package com.spring.market.Details;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory context=new ClassPathXmlApplicationContext("market.xml");
        System.out.println("loaded");
        MarketDetails m1=(MarketDetails) context.getBean("product");
        System.out.println(m1);
        
    }
}
