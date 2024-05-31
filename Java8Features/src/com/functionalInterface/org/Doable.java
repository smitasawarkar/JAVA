package com.functionalInterface.org;

public interface Doable {
 
	default void doit()
	{
		System.out.println(" Do It Now ");
	}
}
