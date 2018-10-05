package com.houseBuildingRecursionProblem;

public class Main {

	public static void main(String[] args) {
		
		HeadRecursion hdr = new HeadRecursion();
		System.out.println("this is the head recursion");
		hdr.buildBricks(5);
		
		System.out.println("this is the tail recursion");
		TailRecursion tr = new TailRecursion();
		tr.buildHome(5);
		
		
	}
}
