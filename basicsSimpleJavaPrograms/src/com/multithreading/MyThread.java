package com.multithreading;

class Test implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i <= 10; i++) {
			System.out.println("Hai Ram Ram");
		}

	}

}

public class MyThread {

	public static void main(String[] args) {

		Test t = new Test();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		t2.start();

	}

}
