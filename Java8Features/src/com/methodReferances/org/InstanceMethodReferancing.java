package com.methodReferances.org;

import java.util.function.BiFunction;

public class InstanceMethodReferancing {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> add = new InstanceArithmethic() :: addition;
		int result = add.apply(10, 20);
		System.out.println("Addition of instance method :: "+result);

	}

}
