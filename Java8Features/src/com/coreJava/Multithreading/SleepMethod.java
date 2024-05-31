package com.coreJava.Multithreading;
//			
//			public class SleepMethod  {
//			//by throwing exception
//			//	public static void main(String[] args) throws InterruptedException {
//			//		for(int i=1;i<=5;i++) {
//			//			Thread.sleep(1000);
//			//			System.out.println(i);
//			//			
//			//		}
//					
//					
//					//if I dont want to throw the exception then use try catch.......u will get the same output
//					//public static void main(String[] args) throws InterruptedException 
//				public static void main(String[] args){
//					try {
//							for(int i=1;i<=5;i++) {
//								Thread.sleep(1000);
//								System.out.println(i);
//							}
//						}
//						catch(Exception e)
//						{
//							System.out.println(e);
//						}		
//				
//				}
//			
//			}



//by extending thread class
public class SleepMethod extends Thread {

	public void run()
	{
		try {
		for(int i=1; i<=5;i++)
		{
			Thread.sleep(1000);
			System.out.println(i);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
		SleepMethod sm= new SleepMethod();
		sm.start();
	}

}