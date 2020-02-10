package com.model.d1d2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.model.b2b3.Shark;

public class ButterflyTest {

	private Butterfly butterfly;
	@Before
	public void setUp() throws Exception {
		butterfly = new Butterfly();
	}

	@Test
	public void testIsCaterpiller() {
		butterfly.isCaterpiller();
	}

	@Test
	public void testSetCaterpiller() {
		butterfly.setCaterpiller(true);
	}

	@Test
	public void testFly() {
		butterfly.fly();
	}

	@Test
	public void testSing() {
		butterfly.sing();
	}

	@Test
	public void testWalk() {
		butterfly.walk();
	}

	@Test
	public void testSwim() {
		butterfly.swim();
	}

}
