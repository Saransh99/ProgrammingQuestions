package com.CharAtOddPlace;

public class Main {
	
	public static void main(String[] args) {
		
		String str = "this will only get the characters at the odd place";
		for(int i=0; i<str.length()-1; i++) {
			if(i%2!=0) {
				System.out.println("char at "+i+" place "+str.charAt(i));
			}
		}
	}
}
