package com.streamApis.org;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachStr {

	public static void main(String[] args) {
	String inputStr ="I Love Java";
	String charStr = inputStr.replaceAll("\\s", "").toLowerCase();
	System.out.println(charStr);
	
	Map<Character, Long> str1 = charStr.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	str1.forEach((letter,count)-> System.out.println(letter+" ::: "+count));
	System.out.println("===========================================================");
	Map<Character, Long> str2 = charStr.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
	str2.forEach((letter,count)-> System.out.println(letter+" ::: "+count));
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	





	
	}

}
