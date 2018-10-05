package com.towerOfHanoiUsingRecursion;
import java.util.Scanner;
/*
 * the tower of the hanoi problem:-   
 * 1. it consist of 3 rods and no.of disks of diff sizes which can slide on to any rod
 * 2. the puzzle starts with the disks placed in the ascending order on one of the rod smallest on the top
 * 3. min no. of moves required to solve the tower of hanoi is (2^n -1) where the n is the no. of the disks in the rods 
 * 4. only one disk can be moved at a time 
 * 5. in each move only the upper disk can be taken from the stack 
 * 6. bigger disk can't be placed on the top of the smaller one 
 */

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("enter the no. of the plates in the rod:- ");
		int input = scan.nextInt();
		System.out.println("steps in the solving of the tower of the hanoi with "+ input + " plates:-");
		
		TowerOfHanoi toh = new TowerOfHanoi();
		toh.solveTowerOfHanoi(input, 'A', 'B', 'C');
		
	}
}
