package com.LambdaExp.org;


public class LambdaExpressionExample {

	public static void main(String[] args) {
		LambdaInterface lambExp =(a,b)->a+b;
		System.out.println("Addition using lambda expression :: "+lambExp.add(10, 30));

	}

}
