package com.Exception;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
