package com.CharAtOddPlace;

public class SplittingString {

	public static void main(String[] args) {
	
		String s1 = "this is the first one of the string";
		String[] words = s1.split("\\s");
		
		for(String w:words) {
			System.out.println(w);
		}
	}
	
	
}
