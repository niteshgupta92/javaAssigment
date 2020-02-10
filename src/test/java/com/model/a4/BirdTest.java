package com.model.a4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BirdTest {

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
	public void testSing() {
		bird.sing();
	}

	@Test
	public void testWalk() {
		bird.walk();
	}

	@Test
	public void testSwim() {
		bird.swim();
	}

}
