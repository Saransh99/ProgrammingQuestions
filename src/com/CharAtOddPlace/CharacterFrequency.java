package com.CharAtOddPlace;
// ctrl+shift+F is used to auto indent the code in the display screen

public class CharacterFrequency {

	public static void main(String[] args) {

		String sample = "we will count the freq of a certain char in this array of the cahras";
		int count = 0;
		for (int i = 0; i < sample.length() - 1; i++) {
			if (sample.charAt(i) == 't') {
				count++;
			}

		}
		System.out.println("freq of the t is : " + count);
	}
}
