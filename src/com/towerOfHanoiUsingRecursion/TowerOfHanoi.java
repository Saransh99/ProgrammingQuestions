package com.towerOfHanoiUsingRecursion;

public class TowerOfHanoi {

	public void solveTowerOfHanoi(int noOfPlates, char rodFrom, char middleRod, char rodTo) {
		
		/*
		 * the base case is when the smallest plate is in the first rod alone with both the other rods in to the last rod 
		 * then we have to place the smallest plate directly to the last rod 
		 */
		if(noOfPlates==1) { // base case
			System.out.println("Plate 1 from "+ rodFrom + " to " + rodTo);
			return ;
		}
		
		/*
		 * this is the first recursion the very first case when we have all the plates in the first rod 
		 * then we need to move the n-1 plates to the middleRod with the help of the rodTo
		 * after this first recursion we will hit the first base case where no. of rods =1 in the first rod so we move the plate from the first rod to the last rod 
		 */
		
		solveTowerOfHanoi(noOfPlates-1, rodFrom, rodTo, middleRod);
		System.out.println("plate "+ noOfPlates+ " from "+ rodFrom + " to " + rodTo);
		
		/* 
		 * now we need to move the rest of the plates in the middleRod to the lastRod withe the help of the first rod 
		 */
		solveTowerOfHanoi(noOfPlates-1, middleRod, rodFrom, rodTo);
		
		
	}
	
	
}
