package com.CharAtOddPlace;

public class GetBytesOfAllChars {

	public static void main(String[] args) {
		String s1 = "aAbBcCdDeEfFgGhH";
		byte[] barr = s1.getBytes();
		for(int i=0; i<barr.length; i++) {
			System.out.println( barr[i]);
		} 
	}
}
