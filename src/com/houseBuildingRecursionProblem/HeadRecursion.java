package com.houseBuildingRecursionProblem;

public class HeadRecursion {
	
	public void buildBricks(int height) {
		
		if(height==0) return ; // base case for the recursion 
		
		buildBricks(height-1); // this will print the height in the assending order as the greater height will be put in the stack first 
		System.out.println(height);
	}
}
