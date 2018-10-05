package com.factorialRecursion;

/*in this type of the case we store the variables in the accumulator and not in the call stack 
 * thus when we bump into the base case then we return the accumulator and not the call stack will makes th
 * 
 */
public class BetterFactorialAlgo {

	public int betterFactorial(int accumulator, int n) {
		if(n==1) return accumulator;
		return betterFactorial(accumulator*n, n-1);
	}
	
	public int calculateFactorial(int n) {
		return betterFactorial(1, n);
	}
}
