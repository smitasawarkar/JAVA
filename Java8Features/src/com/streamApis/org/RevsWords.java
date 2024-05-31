package com.streamApis.org;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RevsWords {

	public static void main(String[] args) {
		String inputStr= "I Love Java";
		
		String[] word = inputStr.split("\\s+");
		String reversedString = Arrays.stream(word).collect(Collectors.toList()).stream().reduce((first, second) -> second + " " + first).orElse("");

		System.out.println(inputStr);
		System.out.println(reversedString);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		

		
	
	}

}
