package com.functionalInterface.org;

public class FunctionalInterfaceClass implements FunInterface {

	public static void main(String[] args) {
	 
		FunInterface funInterface = (a,b)-> a+b;
		System.out.println("addition of input parameters :: "+funInterface.doImplementation(10, 20));
	}

	@Override
	public int doImplementation(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
