package com.streamApis.org;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachString {

	public static void main(String[] args) {
		
		String str="I Love Java";
		System.out.println("Original String :"+str);
		
		Map<Character, Long> getcharwithcount = str.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		getcharwithcount.forEach((letter,count)-> System.out.println(letter+"::::"+count));
		
		
		System.out.println("===================================================================");
		
		List<String> listStr= Arrays.asList("smita","pooja","smita","pragati","nikhil","smita","Ashwini","pooja","Amrita");
		Map<String, Long> countOfString = listStr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		countOfString.forEach((str1,count)->System.out.println(str1 +"::"+count));
		
		System.out.println("===================================================================");
		
		String addPrefixSufixAndDilimilatter = listStr.stream().collect(Collectors.joining(",","[","]"));
		System.out.println("add Prefix Sufix And Dilimilatter : "+addPrefixSufixAndDilimilatter);
		
		
		
	}

}
