package com.qa.blackjackExample;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		TestRunner.allTests();
	}

	
 public static void allTests() {
	 Result result = JUnitCore.runClasses(ValidEntrySuite.class, InvalidEntrySuite.class);
		
	 System.out.println("All Results Passed: " + result.wasSuccessful());
	 
	 if(!result.wasSuccessful()) {
		 System.out.println("Failed Test:");
		 for (Failure failure: result.getFailures()) {
			 System.out.println(failure.getMessage());
		 }
	 	}
   }		 
			 
}