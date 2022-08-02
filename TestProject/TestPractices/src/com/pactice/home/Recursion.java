package com.pactice.home;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursion(5);
	}

	private static void recursion(int i) {
		// TODO Auto-generated method stub
		if(i<1) {
			System.out.println("i is less than 1");
		}
		else {
			recursion(i-1);
			System.out.println("i value is "+i);
		}
	}

}
