package com.coreJava.Multithreading;

public class DaemonThreadDemo extends Thread{

	public void run() {
		if(Thread.currentThread().isDaemon()) {
		System.out.println("Daemon thread Calling");
		
		}
		else {
			System.out.println("Child thread");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Main thread Calling");
		DaemonThreadDemo dt= new DaemonThreadDemo();
		dt.setDaemon(true);
		dt.start();
	}

}
