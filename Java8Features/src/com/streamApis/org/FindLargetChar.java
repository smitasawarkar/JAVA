package com.streamApis.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FindLargetChar {

	public static void main(String[] args) {
		 char listChar[] = {'A','B','Z','E','D','C','A'};
		List<Character> ch = Arrays.asList('A','B','Z','E','D','C','A');

		System.out.println("List of char ::"+ch);
		 Character largestChar = ch.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println("largest Char of List ::"+largestChar);
		
		Arrays.sort(listChar);
		
		
		
		

	}

}
