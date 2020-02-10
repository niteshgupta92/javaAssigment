package com.model.e1;


public class Solution {

	public static void main(String[] args) {

		int animalFlyCount = 0;
		int animalWalkCount = 0;
		int animalSingCount = 0;
		int animalSwimCount = 0;

		Animal[] animal = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Shark(),
				new Clownfish(),
				new Dolhpin(),
				new Frog(),
				new Dog(),
				new Butterfly(),
				new Cat()
		};

		for(int i = 0 ; i< animal.length; i++){
			if(animal[i].fly()){
				animalFlyCount = animalFlyCount + 1;
			}
			if(animal[i].sing()){
				animalSingCount = animalSingCount + 1;
			}
			if(animal[i].walk()){
				animalWalkCount = animalWalkCount + 1;
			}
			if(animal[i].swim()){
				animalSwimCount = animalSwimCount + 1;
			}
		}
		System.out.println("Animal Fly count:"+animalFlyCount);
		System.out.println("Animal Sing count:"+animalSingCount);
		System.out.println("Animal Sing count:"+animalWalkCount);
		System.out.println("Animal Swim count:"+animalSwimCount);
	}
}
