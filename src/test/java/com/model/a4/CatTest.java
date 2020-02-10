package com.model.a4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CatTest {

	private Animal cat;
	@Before
	public void setUp() throws Exception {
		cat = new Cat();
	}

	@Test
	public void testFly() {
		cat.fly();
	}
	
	@Test
	public void testWalk() {
		cat.walk();
	}
	
	@Test
	public void testSwim() {
		cat.swim();
	}
	
	@Test
	public void testSing() {
		cat.sing();
	}

}
