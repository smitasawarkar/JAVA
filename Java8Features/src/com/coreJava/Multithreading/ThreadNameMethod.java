package com.coreJava.Multithreading;

public class ThreadNameMethod extends Thread {

	public void run()
	{
		System.out.println("Thread : "+Thread.currentThread().getName());
	}
	
	
	public static void main(String[] args) {
		System.out.println("Hello : "+Thread.currentThread().getName());
		
		ThreadNameMethod t1 = new ThreadNameMethod();
		t1.setName("Smita");
		t1.start();
		
		ThreadNameMethod t2 = new ThreadNameMethod();
		t2.setName("Ashwini");
		System.out.println("Is thread Alive or not ::"+t2.isAlive());//it return false becz we call it before start()
		t2.start();
		System.out.println("Is thread Alive or not ::"+t2.isAlive());//it return true becz we call it After start()
		
		System.out.println(10/0);
	}

}
