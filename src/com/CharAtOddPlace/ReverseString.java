package com.CharAtOddPlace;

public class ReverseString {
	/*
	 * in this string reversal process we first convert the given string into the
	 * byte array then reverse the byte array to the new byte array
	 * 1. first we convert the given string into the bytes 
	 * 2. then we make a new bytes array and then assign the size of it to the orignal size of the array
	 * 3. we then populate the result byte array with the reverse order of the chars
	 * 4. we then convert the byte array back to the string 
	 */
	public static void main(String[] args) {

		String s1 = "SaranshPal";
		byte[] b1 = s1.getBytes();
		byte[] result = new byte[b1.length];

		for (int i = 0; i < b1.length; i++) {
			result[i] = b1[b1.length - i - 1];

		}
		System.out.print(new String(result));
	}

}
