package com.model.d1d2;

public class Solution {

	public static void main(String[] args) {

		// D Q1 a)
		Butterfly butterfly = new Butterfly();
		butterfly.setCaterpiller(false);
		butterfly.fly();
		
		// D Model Q1 b)
		butterfly.sing();
		
		
		// D Model Q2 a)
		Butterfly caterpiller = new Butterfly();
		caterpiller.setCaterpiller(true);
		caterpiller.fly();
		
		//D Model Q2 b)
		caterpiller.walk();
		
	}

}
