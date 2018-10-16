package com.qa.blackjackExample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class invalidEntry {
	Blackjack b = new Blackjack ();

	
		@Test 
		public void test1() {
		assertEquals("2 low invalid entries", 0, b.play(-10, -10));
		}
		@Test 
		public void test2() {
			assertEquals(0, b.play(-10, 10));	
		}
		@Test 
		public void test3() {
			assertEquals(0, b.play(-10, 30));
		}
		
		@Test 
		public void test4() {
			assertEquals(0, b.play(-10, 50));
		}

		@Test 
		public void test14() {
			assertEquals(0, b.play(35,-10));
			
		}
		
		@Test 
		public void test10() {
			assertEquals(0, b.play(30,-10));
		}
		
		@Test 
		public void test9() {
			assertEquals(0, b.play(10,50));
		}
		
		@Test 
		public void test16() {
			assertEquals(0, b.play(35,30 ));
		}
		
		@Test
		public void test17() {
			assertEquals(" 2 high invalid entries", 0, b.play(35,50));
		}
		
		@Test 
		public void test13() {
			assertEquals(0, b.play(30,50));
		}
		
		@Test
		public void test12() {
			assertEquals(0, b.play(30,30));
		}
		
		@Test
		public void test5() {
			assertEquals(0, b.play(10, 0));
		}
		
		
}


