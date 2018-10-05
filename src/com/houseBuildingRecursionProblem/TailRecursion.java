package com.houseBuildingRecursionProblem;

public class TailRecursion {
	
	public void buildHome(int height) {
		if(height==0) return;
		System.out.println(height); // this will print the height in the descending order 
		buildHome(height-1);
	}
}
