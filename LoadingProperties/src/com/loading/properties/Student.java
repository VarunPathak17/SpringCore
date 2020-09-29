package com.loading.properties;

import org.springframework.beans.factory.annotation.Value;


public class Student {
	
	@Value("${student.name}")
	private String name;
	@Value("${student.course}")
	private String course;
	@Value("${student.hobby}")
	private String hobby;
	
	
	public String getName() {
		return name;
	}
	
	public String getCourse() {
		return course;
	}
	
	public String getHobby() {
		return hobby;
	}
	

	public void display() {
		System.out.println("Student Name:- "+name);
		System.out.println("Course Name:- "+course);
		System.out.println("Hobbt:- "+hobby);
	}
	public void jdbc() {
		String []array= {name,course,hobby};
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
