package org.dimigo.thread;

public class Race2 {

	public static void main(String[] args) {
		
		System.out.println("main thread start");
		
		Thread t1 = new Runner("이어진");
		Thread t2 = new Runner("정욱재");
		
		
		t1.start();
		t2.start();
		
		System.out.println("main thread end");

	}

}
