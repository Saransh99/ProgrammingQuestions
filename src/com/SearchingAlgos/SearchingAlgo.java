package com.SearchingAlgos;

public class SearchingAlgo {

	private int[] array;
	
	public SearchingAlgo(int[] array) {
		this.array = array;
	}
	
	public int linearSearch(int item) {
		
		for(int i=0;i<array.length; i++) {
			if(array[i]==item) {
				System.out.println("item: "+item+" found at the position: "+i);
			}
		}
		
		return -1;
	}
	
	
	/*
	 * binary search time is O(logn):- this will only work with the sorted array as we are comparing the item to the middle one 
	 * if the array is not sorted then we can't compare the item to the middle item
	 */
	public int binarySearch(int item) {
		return binarySearch(0,array.length-1,item);
	}
	
	private int binarySearch(int startIndex, int lastIndex, int item) {
		
		if(lastIndex<startIndex) {
			System.out.println("the item: "+item + " is not present in the array");
			return -1;
		}
		
		int middleIndex = (startIndex+lastIndex)/2;
		
		if(item==array[middleIndex]) {
			System.out.println("the item: "+item+" found in the middle index "+middleIndex);
		}else if(item<array[middleIndex]) {
			return binarySearch(startIndex, middleIndex-1, item);
		}else {
			return binarySearch(middleIndex+1, lastIndex, item);
		}
		
		return 1;
		
	}
	
	
}
