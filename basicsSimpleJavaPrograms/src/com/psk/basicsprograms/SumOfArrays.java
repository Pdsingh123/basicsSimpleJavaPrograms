package com.psk.basicsprograms;

public class SumOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(new int[]{10,20,30,40}));
	}

	private static int sum(int[]x) {
		
		int total =0;
		for(int y:x) {
		total = total+y;
		
	}
		return total;
	}

	
	}


