package com.qa.blackjackExample;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

	@RunWith(Parameterized.class)
	public class Parameterisation{
		Blackjack b = new Blackjack();
	
	@Parameters 
	public static Collection <Object[]> data() {
		return Arrays.asList(new Object[][] {{0,-10,-10}, {0,-10,10},{0,-10,30}, {0,-10,50}}); 
	}
	
	private int intPlayer; 
	private int intDealer; 
	private int intExpected; 
	
	public Parameterisation (int expected, int player, int dealer) {
		intPlayer = player; 
		intDealer = dealer; 
		intExpected = expected; 
}
	@Test 
	public void test() {
		assertEquals(intExpected, b.play(intPlayer, intDealer));
		
	}
	
}
