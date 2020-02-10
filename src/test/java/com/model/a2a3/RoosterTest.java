package com.model.a2a3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RoosterTest {


	private Animal rooster;
	@Before
	public void setUp() throws Exception {
		rooster = new Rooster();
	}

	@Test
	public void testSing() {
		rooster.sing();
	}

}
