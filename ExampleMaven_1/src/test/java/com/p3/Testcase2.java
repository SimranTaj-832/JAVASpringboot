package com.p3;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testcase2 {
	@BeforeClass
	public static void setUpBeforeClass()throws Exception{
		System.out.println("before class");
	}
	@Before
	public void setUp()throws Exception{
		System.out.println("before");
	}
	@Test
	public void testCube() {
		System.out.println("test case cube");
		assertEquals(27,Calculation1.cube(3));
	}
	@Test
	public void testReverseWord() {
		System.out.println("test case reverse word");
		assertEquals("ym eman si nahk ",Calculation1.reverseWord("my name is khan"));
	}
	@After
	public void tearDown()throws Exception{
		System.out.println("after");
	}
	@AfterClass
	public static void tearDownAfterClass()throws Exception{
		System.out.println("after class");
	}

}
