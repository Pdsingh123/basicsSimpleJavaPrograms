package com.Exception;

public class ExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		int x=10;
		try {
			
			System.out.println(x/0);
			System.out.println("Try block");
			
		}catch(ArithmeticException e) {
			
			System.out.println("Catch Block");
		}
	}

}
