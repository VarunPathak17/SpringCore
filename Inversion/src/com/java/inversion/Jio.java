package com.java.inversion;

public class Jio implements Simcard {

	@Override
	public void calling() {
		System.out.println("--Calls using jio ... Best network--");
	}

	@Override
	public void data() {
		System.out.println("--Data using jio ... Best network Jio--");

	}

}
