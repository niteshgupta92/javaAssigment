package com.model.e1;

public class Clownfish implements Fish{

	public boolean swim() {
		return true;
	}

	public boolean walk() {
		return false;
	}

	public boolean fly() {
		return false;
	}

	public boolean sing() {
		return false;
	}

	public void appearance() {
		System.out.println("Clownfish are small and colourful (orange)");
		
	}

	public void action() {
		System.out.println("Clownfish make jokes");		
	}

}
