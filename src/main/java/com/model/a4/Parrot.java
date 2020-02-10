package com.model.a4;


public class Parrot extends Bird{

	private Animal animal = null;

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public void sing(){
		if(null == animal) {
			Phone phone = new Phone();
			phone.sing();
		}else {
			animal.sing();
		}
	}
}
