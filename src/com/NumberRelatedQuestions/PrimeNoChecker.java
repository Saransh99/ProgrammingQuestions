package com.NumberRelatedQuestions;

import java.util.Scanner;

/*
 * A prime no:-
 * 1. which is greater than 1
 * 2. which is only divisible by 1 and itself
 * 3. two(2) is the only even prime no.
 */
public class PrimeNoChecker {

	public static void main(String[] args) {
		// this is the most basic program to check if the no. is a prime no. or not

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no.:- ");
		int input = scan.nextInt();
		if (isPrime(input)) {
			System.out.println(input + " is a prime no.");
		} else {
			System.out.println(input + " is not a prime no.");
		}

	}

	public static boolean isPrime(int input) {
		if (input <= 1) { // prime no. can't be less than 1
			return false;
		}
		// here we only check from 2 to the sqrt of the input no.
		// because if the no. is divisible by sqrt of it then it is not a prime no.
		for (int i = 2; i < Math.sqrt(input); i++) {
			if (input % i == 0) { // we also return false if the no. is divisible by 2 or any other factor except
									// itself
				return false;
			}
		}
		// if the inputted no. returns false in both the above cases then it is a prime no.
		return true;
	}
}
