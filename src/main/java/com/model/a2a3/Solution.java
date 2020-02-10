package com.model.a2a3;

public class Solution {

	public static void main(String[] args) {
		// Model A q2 a) 
		Animal duck = new Duck();
		duck.sing();
		// Model A q2 b)
		duck.swim();
		
		// Model A q2 c)--------- Dynamic Method Dispatch - by using reference of Animal and object of Chicken
		Animal chicken = new Chicken();
		chicken.sing();
		// Model A q2 d)
		chicken.fly();
		
		//Model A q3
		Animal rooster = new Rooster();
		// Model A q3 a)
		rooster.sing();
		
		// Model A q3 b) Rooster and Chicken both extends from Bird, so both are bird
		rooster.walk();
		chicken.walk();
	}

}
