package com.p1.testing;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class TestList {
	@Test
	public void testList_ReturnSingle_Value() {
		List<String> mocklist=mock(List.class);
			when(mocklist.size()).thenReturn(1);
		assertEquals(1,mocklist.size());
		assertEquals(1,mocklist.size());
		System.out.println(mocklist.size());
		System.out.println(mocklist);
	}
	
	@Test
	public void testList_get() {
		List<String> mocklist=mock(List.class);
		when(mocklist.get(0)).thenReturn("Mockito");
		assertEquals("Mockito",mocklist.get(0));
	}

}
