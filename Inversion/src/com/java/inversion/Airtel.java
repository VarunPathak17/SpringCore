package com.java.inversion;

public class Airtel implements Simcard{
	public Airtel() {
		System.out.println("Airtel Constructor called");
	}
	
	public void calling() {
		System.out.println("---Calling using airtel sim---");
	}
	public void data() {
		System.out.println("Web browsing using airtel...");
	}

}
