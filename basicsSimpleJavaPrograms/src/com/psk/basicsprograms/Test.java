package com.psk.basicsprograms;

class D {
	public int m1(int a, int b) {
		return a + b;

	}
}
	public class Test extends D {
		public int m1(int a, int b, int c) {
			return a + b + c;
		}

		public static void main(String[] args) {

			Test t = new Test();
			System.out.println(t.m1(10, 20));

		}

	}
