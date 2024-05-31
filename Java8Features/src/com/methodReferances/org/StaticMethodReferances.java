package com.methodReferances.org;

import java.util.function.BiFunction;

public class StaticMethodReferances {

	public static void main(String[] args) {
	
		BiFunction<Integer, Integer, Integer> add1 = StaticArithmetic::add;
		int result1 =add1.apply(10,20);
		System.out.println("first static method call "+result1);
		BiFunction<Integer, Float, Float> add2 =StaticArithmetic::add;
		float result2 =add2.apply(10, 20.0f);
		System.out.println("second static method call "+result2);
		BiFunction<Float,Float,Float> add3 =StaticArithmetic::add;
		float result3 =add3.apply(10.0f, 20.0f);
		System.out.println("Third static method call "+result3);
	}

}
