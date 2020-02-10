package com.model.a4;

public class Solution {

	public static void main(String[] args) {
		// Model A q4 a)
		Parrot parrotWithDog = new Parrot();
		parrotWithDog.setAnimal(new Dog());
		parrotWithDog.sing();
		
		// Model A q4 b)
		Parrot parrotWithDuck = new Parrot();
		parrotWithDuck.setAnimal(new Duck());
		parrotWithDuck.sing();
		
		// Model A q4 c)
		Parrot parrotWithCat = new Parrot();
		parrotWithCat.setAnimal(new Cat());
		parrotWithCat.sing();
		
		// Model A q4 d)
		Parrot parrotWithRooster = new Parrot();
		parrotWithRooster.setAnimal(new Rooster());
		parrotWithRooster.sing();
		
		Parrot parrotWithPhone = new Parrot();
		parrotWithPhone.sing();
	}

}
