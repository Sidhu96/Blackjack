package com.qa.blackjackExample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class bustEntry {
	Blackjack b = new Blackjack ();
	
	@Test
	public void test12() {
		assertEquals(0, b.play(30,30));
	}

	@Test 
	public void test13() {
		assertEquals(0, b.play(30,50));
	}
	
	@Test 
	public void test16() {
		assertEquals(0, b.play(35,30 ));
	}
	
	@Test
	public void test17() {
		assertEquals(" 2 high invalid entries", 0, b.play(35,50));
	}
}
