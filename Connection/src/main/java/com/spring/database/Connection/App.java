package com.spring.database.Connection;

import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	//ApplicationContext context=new ClassPathXmlApplicationContext("databasedetails.xml");
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfiguration.class);
    	System.out.println("Loading Configuration File");
		StudentDAO studentDAO=context.getBean("details",StudentDAO.class);
    	studentDAO.selectAllRows();
    	((AnnotationConfigApplicationContext) context).close();
    
    	
    }
}
