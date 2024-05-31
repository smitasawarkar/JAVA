package com.functionalInterface.org;

public class FunctionalInterfaceExpample implements Sayable{

	@Override
	public void say(String msg) {
	System.out.println(msg);
		
	}
	
	public static void main(String[] args) {
		FunctionalInterfaceExpample FI = new FunctionalInterfaceExpample();
		FI.say("Hello there");
		FI.doit();

	}

	

	
	
	
}
