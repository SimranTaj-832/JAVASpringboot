package com.p1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyEvenOddTest {

	@Test
	public void test2EvenOddNumber() {
		MyEvenOdd meo= new MyEvenOdd();
			assertEquals("11 is not a even number",false,meo.isEvenNumber(11));
		
	}
	@Test
	public void test3EvenOddNumber() {
		MyEvenOdd meo= new MyEvenOdd();
			assertEquals("13 is not a even number",false,meo.isEvenNumber(13));
		
	}
	@Test
	public void testEvenOddNumber() {
		MyEvenOdd meo= new MyEvenOdd();
			assertEquals("10 is a even number",true,meo.isEvenNumber(10));
		
	}
}
