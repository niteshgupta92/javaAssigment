package com.model.b2b3;

public class ClownFish implements Fish{
	public void appearance() {
		System.out.println("Clownfish are small and colourful (orange)");
	}
	
	public void action() {
		System.out.println("Clownfish make jokes");
	}

	public void sing(){
		System.out.println("Fishes don't sing");
	}
	
	public void walk(){
		System.out.println("Fishes can't walk");
	}
	
	public void swim(){
		System.out.println("Fishes can swim");
	}

	public void fly() {
		System.out.println("Fishes can't fly");
		
	}
}
