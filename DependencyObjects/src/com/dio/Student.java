package com.dio;

public class Student {
	private int id;
	private MathCheat mathCheat;
	
	public void setId(int id) {
		this.id = id;
	}

	//Setter Method
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void cheating() {
		mathCheat.mathCheatStarted();
		System.out.println("Hey My Id is :- "+id);
	}
}
