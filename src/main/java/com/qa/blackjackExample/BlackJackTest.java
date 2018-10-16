package com.qa.blackjackExample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BlackJackTest {
	Blackjack b = new Blackjack ();
	static int count = 1;
	
	@BeforeClass 
		public static void play() {
		System.out.println("Welcome to my test\n");
	}
	
	@Before 
		public void setUp() {
		System.out.println("Running Test " + count );
	}
	
	
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
			assertEquals("invalid figure", 0, b.play(-10, 30));
		}
		
		@Test 
		public void test4() {
			assertEquals(0, b.play(-10, 50));
		}
		
		@Test
		public void test5() {
			assertEquals(0, b.play(10, 0));
		}
		
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
		
		@Test 
		public void test9() {
			assertEquals(0, b.play(10,50));
		}
		
		@Test 
		public void test10() {
			assertEquals(0, b.play(30,-10));
		}
		
		@Test 
		public void test11() {
			assertEquals(10, b.play(30, 10));
		}
		
		@Test
		public void test12() {
			assertEquals(0, b.play(30,30));
		}
		
		@Test 
		public void test13() {
			assertEquals(0, b.play(30,50));
		}
		
		@Test 
		public void test14() {
			assertEquals(0, b.play(35,-10));
		}
		
		@Test 
		public void test15() {
			assertEquals(0, b.play(35,10));
		}
		
		@Test 
		public void test16() {
			assertEquals(0, b.play(35,30 ));
		}
		
		@Test
		public void test17() {
			assertEquals(" 2 high invalid entries", 0, b.play(35,50));
		}
		
	@After 
		public void teardown() {
		System.out.println(count + "/17 Finished\n");
		count ++; 
	}
	
	@AfterClass 
		public static void end() {
		System.out.println("Tests Complete");	
	}
		
		
		
		
		
	
	
}
