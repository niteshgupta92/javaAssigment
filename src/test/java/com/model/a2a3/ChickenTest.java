package com.model.a2a3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ChickenTest {

	Animal chicken ;
	@Before
	public void setUp() throws Exception {
		chicken = new Chicken();
	}

	@Test
	public void testSing() {
		chicken.sing();
	}

	@Test
	public void testFly() {
		chicken.fly();
	}

}
