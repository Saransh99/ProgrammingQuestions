package com.PatternProblems;
import java.util.Scanner;

public class SimplePattern {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no:- ");
		int n = scan.nextInt();
		printStars(n);
	}
	
	public static void printStars(int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
