package com.StringRelatedQuestions;
import java.util.Scanner;

public class substringInJava {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string:- ");
		String input = scan.nextLine();
		
		System.out.println(input.substring(0, 6)); // string from 0 to 6
		System.out.println(input.substring(6));  // string from 6 
	}
}
