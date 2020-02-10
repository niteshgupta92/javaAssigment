package com.model.b2b3;

import org.junit.Before;
import org.junit.Test;


public class ClownFishTest {

	private ClownFish clownFish;
	@Before
	public void setUp() throws Exception {
		clownFish = new ClownFish();
	}

	@Test
	public void testAppearance() {
		clownFish.appearance();
	}

	@Test
	public void testAction() {
		clownFish.action();
	}

	@Test
	public void testSing() {
		clownFish.sing();
	}

	@Test
	public void testWalk() {
		clownFish.walk();
	}

	@Test
	public void testSwim() {
		clownFish.swim();
	}

	@Test
	public void testFly() {
		clownFish.fly();
	}

}
