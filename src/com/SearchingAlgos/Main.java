package com.SearchingAlgos;

public class Main {
	
	public static void main(String[] args) {
		
		int array[] = {1,4,6,7,8,10,11};
//		SearchingAlgo linear = new SearchingAlgo(array);
//		linear.linearSearch(12);
		
		SearchingAlgo binary = new SearchingAlgo(array);
		binary.binarySearch(0);
	}
}
