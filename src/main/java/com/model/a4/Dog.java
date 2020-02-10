package com.model.a4;

public class Dog implements Animal {
	
	public void fly(){
		System.out.println("I can not fly");
	}
	public void sing(){
		System.out.println("Woof, woof");
	}

	public void walk() {
		System.out.println("I am walking");
	}

	public void swim() {
		System.out.println("I cannot swim");
		
	}
}
