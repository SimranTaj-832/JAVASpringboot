package com.p2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {
	private Addition addition;
	@Before
	public void setUp() {
		addition = new Addition();
	}
	@Test
	public void test1() {
		int i= addition.add(3, 7);
		assertEquals(10,i);
	}
	@Test
	public void test2() {
		int i= addition.add(3, 7);
		assertEquals(11,i);
	}
	@Test
	public void test3() {
		int i= addition.add(3, -7);
		assertEquals(-4,i);
	}
	@After
	public void tearDown() {
		addition = null;
	}
}
