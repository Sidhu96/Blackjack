package com.qa.blackjackExample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class normalEntry {
	Blackjack b = new Blackjack ();
	
	@Test 
	public void test6() {
		assertEquals(12, b.play(10,12));
	}
	
	@Test 
	public void test7() {
		assertEquals(12, b.play(12, 10));
	}
	
	@Test public void test8() {
		assertEquals(10, b.play(10,22));
	}
	
}
