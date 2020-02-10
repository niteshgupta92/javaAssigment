package com.model.a1;

import org.junit.Before;
import org.junit.Test;


public class AnimalTest {

	private Animal bird;
	@Before
	public void setUp() throws Exception {
		bird = new Bird();
	}

	@Test
	public void testFly() {
		bird.fly();
	}
	
	@Test
	public void testWalk() {
		bird.walk();
	}
	
	@Test
	public void testSwim() {
		bird.swim();
	}
	
	@Test
	public void testSing() {
		bird.sing();
	}


}
