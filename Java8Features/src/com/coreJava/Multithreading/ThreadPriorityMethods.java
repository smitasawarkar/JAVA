package com.coreJava.Multithreading;

public class ThreadPriorityMethods extends Thread {

	public void run() {
		System.out.println("Child Thread ::" +Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
	System.out.println("Default Priority of Main Thread :: "+Thread.currentThread().getPriority());
	
	Thread.currentThread().setPriority(MAX_PRIORITY);
	System.out.println("method MAX_PRIORITY ::"+Thread.currentThread().getPriority());
	
	Thread.currentThread().setPriority(MIN_PRIORITY);
	System.out.println("method MIN_PRIORITY ::"+Thread.currentThread().getPriority());
	
	Thread.currentThread().setPriority(NORM_PRIORITY);
	System.out.println("method NORM_PRIORITY ::"+Thread.currentThread().getPriority());
	
	Thread.currentThread().setPriority(6);
	
	ThreadPriorityMethods tp= new ThreadPriorityMethods();
	tp.start();
	}

}
