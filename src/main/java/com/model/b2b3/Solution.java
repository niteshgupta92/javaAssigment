package com.model.b2b3;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shark shark = new Shark();
		ClownFish clownFish = new ClownFish();
		// Model B q2 a)
		shark.appearance();

		// Model B q2 b)
		clownFish.appearance();

		// Model B q2 b)
		clownFish.action();

		// Model B q2 d)
		shark.action();
		
		// Model B q3 a)
		Dolphins dolphins = new Dolphins();
		dolphins.swim();
	}
}
