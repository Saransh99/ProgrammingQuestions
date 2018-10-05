package com.CharAtOddPlace;

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {
		String inputString = "SaranshPal";
		StringBuilder str2 = new StringBuilder();
		str2.append(inputString);
		str2= str2.reverse();
		System.out.println("reverse the string:- "+inputString+ " using the StringBuilder:- "+str2);
	}
}
