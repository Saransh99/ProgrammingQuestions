package com.NumberRelatedQuestions;
import java.util.Scanner;

/*
 * A number is said to be palindrome if the reverse of the no. is equal to the orignal no.
 * 1. first get the no.
 * 2. then store the orignal no. in the temp var
 * 3. then reverse the orignal no.
 * 4. then check if the orignal no. and the reverse one are the same no. or not 
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("NOTE:- a no. is a palindrome if the orignal no. and the reverse no. are both equal");
		System.out.println("enter the no. you want to check the palindrome for:- ");
		int no1 = scan.nextInt();
		int temp;
		temp = no1;
		int reverse = 0;
		
		// first reverse the no.
		while(no1!=0) {
			int digit = no1%10;
			reverse = reverse*10 + digit;
			no1/=10;
		}
		System.out.println("the orignal no. is: "+temp);
		System.out.println("reversed no. is: "+reverse);
		if(temp==reverse) {
			System.out.println("the given no. is a palindrome");
		}else {
			System.out.println("the given no. is not a palindrome");
		}
	}
}
