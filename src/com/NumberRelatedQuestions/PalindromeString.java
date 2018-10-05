package com.NumberRelatedQuestions;
import java.util.Scanner;

/*
 * Palindrome string is a string which is same after reversing it
 * we implement the reverse loop to store the char in the String
 * then check the orignal and the reverse String if both are the same then the given string is a palindrome else it is not a palindrome
 * 
 */
public class PalindromeString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String orignal, reverse = "";
		System.out.print("Enter the String:- ");
		orignal = scan.nextLine();
		
		for(int i= orignal.length()-1; i>=0; i--) {
			reverse = reverse + orignal.charAt(i);
		}
		System.out.println("the orignal string is: "+orignal);
		System.out.println("The reversed string is: "+reverse);
		if(orignal.equalsIgnoreCase(reverse)) {
			System.out.println("the inputted string is a palindrome");
		}else {
			System.out.println("the string is not a palindrome");
		}
	}
	
}
