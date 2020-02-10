package com.model.b2b3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SharkTest {

	private Shark shark;
	@Before
	public void setUp() throws Exception {
		shark = new Shark();
	}

	@Test
	public void testAppearance() {
		shark.appearance();
	}

	@Test
	public void testAction() {
		shark.action();
	}

	@Test
	public void testSing() {
		shark.sing();
	}

	@Test
	public void testWalk() {
		shark.walk();
	}

	@Test
	public void testSwim() {
		shark.swim();
	}

	@Test
	public void testFly() {
		shark.fly();
	}

}
