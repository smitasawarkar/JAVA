package com.DefaultAndStaticMethod.org;

public class DefaultMethod implements sayable{

	//implemting abstract method
	@Override
	public void sayMore(String msg) {
		System.out.println(msg);
		
	}
	public static void main(String[] args) {
		DefaultMethod dm = new DefaultMethod();
		dm.say();
		dm.sayMore("This is abstarct method");
		sayable.sayLouder("This is static method call");

	}

	

}
