package com.factorialRecursion;
/*
 * this is the most basic factorial recursion method this will put a whole lot of load on to the call stack
 * this will make the algo slow
 */

public class Main {
	
	public static void main(String[] args) {
//		SimpleFactorial sf = new SimpleFactorial();
//		System.out.println(sf.simpleFactorial(10));
		
		BetterFactorialAlgo bfa = new BetterFactorialAlgo();
		System.out.println(bfa.calculateFactorial(100));
	}
}
