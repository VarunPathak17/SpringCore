package com.java.inversion;

public class VodaPhone implements Simcard {
	public void calling() {
		System.out.println("---Calling using vodaphone sim---");
	}
	public void data() {
		System.out.println("Web browsing using vodaphone...");
	}

}
