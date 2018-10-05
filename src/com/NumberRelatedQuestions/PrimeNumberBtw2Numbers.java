package com.NumberRelatedQuestions;
import java.util.Scanner;

public class PrimeNumberBtw2Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first no:- ");
		int n1 = scan.nextInt();
		System.out.print("Enter the second no.:- ");
		int n2 = scan.nextInt();
		
		for(int i=n1; i<=n2; i++) {
			if(isPrime(i)) {
				System.out.print(i+",");
			}
		}
	}
	
	public static boolean isPrime(int input) {
		if(input<=1) {
			return false;
		}
		for(int i=2; i<=Math.sqrt(input); i++) {
			if(input%i == 0) {  // if the no. is divisible by 2 or any other no. then it is also not a prime no.
				return false;
			}
		}
		
		return true;  // means a prime no
	}
}
