package com.ArrayList.org;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicateStringUsingStream {

	public static void main(String[] args) {
	List<String> listOfString = Arrays.asList("Java","Kotlin","C","Java","C++","C","Python");
	System.out.println("List of string "+listOfString);
	List<String> WithoutDupStr = listOfString.stream().distinct().collect(Collectors.toList());
	System.out.println("Without duplicate String"+WithoutDupStr);
	

	
	}
	

	

}
