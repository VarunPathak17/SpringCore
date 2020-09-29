package com.spring.database.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@SuppressWarnings("deprecation")
@Component("details")
public class StudentDAO {
	
	private String driver;
	
	private String url;
	
	private String username;
	
	private String password;
	Connection con;
	public String getDriver() {
		return driver;
	}
	@Required
	@Value("${StudentDAO.driver}")
	public void setDriver(String driver) {
		System.out.println("Setting Driver");
		this.driver = driver;
		
	}
	public String getUrl() {
		return url;
	}
	@Required
	@Value("${StudentDAO.url}")
	public void setUrl(String url) {
		System.out.println("setting url");
		this.url = url;
	
	}
	public String getUsername() {
		return username;
	}
	@Value("${StudentDAO.username}")
	public void setUsername(String username) {
		System.out.println("Setting username");
		this.username = username;
	
	}
	public String getPassword() {
		return password;
	}
	@Value("${StudentDAO.password}")
	public void setPassword(String password) {
		System.out.println("Setting Password");
		this.password = password;
		
	}
	//creating connection
	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException{
		System.out.println("Inside Custom INIT  ");
		createconnection();
	}
	public void createconnection() throws ClassNotFoundException, SQLException {
		System.out.println("Creating connection ");
		Class.forName(driver);
		con=DriverManager.getConnection(url,username,password);
	}
	
	public void selectAllRows() throws ClassNotFoundException, SQLException {
		System.out.println("Retrieving Data From Database");
		Statement stmt=con.createStatement();
		ResultSet rSet=stmt.executeQuery("Select * from hostel");
		while(rSet.next()) {
			int studentid=rSet.getInt(1);
			String studentname=rSet.getString(2);
			int studentfees=rSet.getInt(3);
			System.out.println(studentid+" , "+studentname+" , "+studentfees);
		}
		
	}
	public void deletestudentRecord(int i) throws ClassNotFoundException, SQLException {
		Statement stmt=con.createStatement();
		stmt.executeUpdate("delete from hostel where stdid ="+i);
		System.out.println("Deleted the particular record from database "+i);
		
	}
	public void close() throws SQLException {
		con.close();
	}
	@PreDestroy
	public void destroy() throws SQLException {
		System.out.println("In destroy method");
		close();
	}
}
