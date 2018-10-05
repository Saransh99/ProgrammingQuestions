package com.NumberRelatedQuestions;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		System.out.print("enter the no. u want to reverse:- ");
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int reverse = 0;
		
		while(n1!=0) {
			int digit = n1%10;
			reverse = reverse*10 + digit;
			n1/=10;
		}
		System.out.println("reversed no. is:- "+reverse);
	}

}
