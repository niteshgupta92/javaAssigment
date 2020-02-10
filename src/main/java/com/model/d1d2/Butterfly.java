package com.model.d1d2;

public class Butterfly implements Animal {

	boolean isCaterpiller= false;
	
	public boolean isCaterpiller() {
		return isCaterpiller;
	}

	public void setCaterpiller(boolean isCaterpiller) {
		this.isCaterpiller = isCaterpiller;
	}
	public void fly() {
		if(isCaterpiller) {
			System.out.println("Caterpiller can not fly");
		}else {
			System.out.println("Butterfly can fly");
		}
	}
	
	public void sing() {
		System.out.println("A Butterfly does not sing");
	}

	public void walk() {
		if(isCaterpiller) {
			System.out.println("Caterpillar can walk");
		}else {
			System.out.println("Butterfly can not walk");
		}
	}

	public void swim() {
		System.out.println("A Butterfly does not swim");
		
	}
}
