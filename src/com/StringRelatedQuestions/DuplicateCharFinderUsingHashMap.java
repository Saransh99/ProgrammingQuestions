package com.StringRelatedQuestions;
import java.util.Scanner;
import java.util.*;
/*
 * we can use the java hashMap to save the chars as keys and their count as the values
 * if the a char already has a value then increase the char count
 */

public class DuplicateCharFinderUsingHashMap {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String:- ");
		String input = scan.nextLine();
		countDuplicateChars(input);
	}
	
	public static void countDuplicateChars(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] chars = str.toCharArray();
		
		for(Character ch:chars) {
			if(map.containsKey(ch)) { // if the hashMap already contains that key then increment the value of the key by 1
				map.put(ch, map.get(ch)+1);
			}else {  
				map.put(ch, 1);  // if it is a new key then put it in the hashMap and increment the value by 1
			}
			
		}
		
		Set<Character> keys = map.keySet();
		
		for(Character ch:keys) {
			if(map.get(ch)>1) {
				System.out.println("Char:- "+ch+" Number of times:- "+map.get(ch));
			}
		}
		
	}
}
