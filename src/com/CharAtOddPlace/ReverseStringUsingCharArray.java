package com.CharAtOddPlace;

public class ReverseStringUsingCharArray {
	
	// done by converting the String into the char array

	public static void main(String[] args) {
		String inputString = "SaranshPal";
		char[] chr1 = inputString.toCharArray();
		
		for(int i=chr1.length-1; i>=0; i--) {
			System.out.print(chr1[i]);
		}
	}
}
