package com.model.e1;

public class Shark implements Fish{

	public boolean fly() {
		return false;
	}
	
	public boolean walk() {
		return false;
	}
	
	public boolean swim() {
		return true;
	}

	public boolean sing() {
		return false;
	}

	public void appearance() {
		System.out.println("Sharks are large and grey");
		
	}

	public void action() {
		System.out.println("Sharks eat other fish");
		
	}

}
