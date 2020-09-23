package com.dio;

public class AnotherStudent {
	private MathCheat cheat;
	
	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}

	public void startCheating() {
		cheat.mathCheatStarted();
		System.out.println("Another Started Cheating.");
	}

}
