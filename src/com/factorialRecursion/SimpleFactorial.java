package com.factorialRecursion;

public class SimpleFactorial {

	// this is the most basic factorial implementation using the recursion
	
	public int simpleFactorial(int n) {
		if(n==1) return 1;
		return n*simpleFactorial(n-1);
	}
}
