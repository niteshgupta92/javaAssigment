package com.model.b2b3;

public class Shark implements Fish{
	
	public void appearance() {
		System.out.println("Sharks are large and grey");
	}
	
	public void action() {
		System.out.println("Sharks eat other fish");
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
