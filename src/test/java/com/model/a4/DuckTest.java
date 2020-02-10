package com.model.a4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DuckTest {

	private Animal duck;
	@Before
	public void setUp() throws Exception {
		duck = new Duck();
	}


	@Test
	public void testSing() {
		duck.sing();
	}

	@Test
	public void testSwim() {
		duck.swim();
	}

}
