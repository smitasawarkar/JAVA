package com.stringJoiner.org;

import java.util.StringJoiner;

public class StringJoinerExp {

	public static void main(String[] args) {
		StringJoiner sj =new StringJoiner(",","[","]");
		
		sj.add("Rahul");
		sj.add("Kajal");
		sj.add("pooja");
		sj.add("Kunal");
		sj.add("smita");
		
		System.out.println(sj);
	}

}
