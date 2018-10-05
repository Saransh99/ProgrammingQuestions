package com.RecursionProblems;

/*a method or the procedure where the solution to a problem depends on the solutions the 
 * BASE case:- while using the recursion we need to define the base case for the given problem 
 * 
 * Tail recursion:- when the recursive call occurs at the end of the method then it is called as the tail recursion
 * the tail recursion is similar to the looop
 * the method executes all the statements before jumping in to the recursive method 
 * 
 * Head Recursion:- when the recursive call occurs at the starting of the method then it is called as the head reursion
 * the method saves the state before jumping into the next recursive call
 * 
 * recursion is handled with the help of the stack 
 * the os helps us with  the recursion so we don't need to write our own stack 
 * 
 * Recursion is slower than the iterative as we first push the items to the stack then we need to retreive the method calls from the stack this makes recursion atleast 2 times slower than the iterative one 
 * 
 */
public class Main {
	
	public static void main(String args[]) {
		//  add the first n no.s recursivley
		/*
		 * all the method calls is pushed on to the stack until we hit the base case 
		 * when we hit the base case then we will assign all the values to the recursive methods 
		 * 
		 */
		System.out.println(addNumbers(3));
		
	}
	
	public static int addNumbers(int n) {
		
		if(n==1) return 1; // base case 
		return n+addNumbers(n-1);
		
	}
}
