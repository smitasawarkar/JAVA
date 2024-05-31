package com.DefaultAndStaticMethod.org;

public interface sayable {

	default void say()
	{
		System.out.println("This is default method");
	}
	
	void sayMore(String msg);
	
	static void  sayLouder(String msg)
	{
		System.out.println(msg);
	}
}
