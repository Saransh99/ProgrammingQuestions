package com.NumberRelatedQuestions;

import java.util.Scanner;
/*
 * ARMSTRONG no.:- 
 * 1. A no. is an armstrong no. if the no. is equal to the sum of all the cube root of the digits
 * 2. example:- 153 = 1^3 + 5^3 + 3^3  i.e 3+125+27 = 153
 */

public class ArmStrongNumber {

	public static void main(String[] args) {
		/*
		 * we will solve this one similar to the no. reversal we don't have to reverse
		 * the no. we wil just grab each of the no.s and then add the cube root of them
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no:- ");
		int orignalNo = scan.nextInt();

		int remainder, result = 0;
		int temp = orignalNo;

		while (temp != 0) {
			remainder = temp % 10;
			result += power(remainder, 3);
			temp /= 10;
		}
		if (result == orignalNo) {
			System.out.println("the given no. is an armstrong no");
		} else {
			System.out.println("the given no. is not an armstrong no");
		}
		
		//System.out.println(power(3,4));  power function testing

	}
	
	// function to calculate the power of a given no.    ex:- 2^3 = 8
	public static int power(int number, int power) {

		int result = 1;
		if (power == 0) { // whatever the no. is if the power is 0 then the result will be 1
			return result;
		}

		while (power != 0) {
			result *= number;  // here we keep on multiplying the no. until the power is zero
			--power;
		}

		return result;
	}

}
