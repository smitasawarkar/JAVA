package com.streamApis.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class seprateEvenAndOddElementsFromList {

	public static void main(String[] args) {
	List<Integer> listOfInteger = Arrays.asList(1,3,2,4,61,5,6,88,4,3,2,9,10);
	System.out.println("List of Integers"+listOfInteger);
	List<Integer> evenNo = listOfInteger.stream().filter(i-> i%2==0).distinct().collect(Collectors.toList());
	System.out.println("List of even integer"+evenNo);
	List<Integer> oddList = listOfInteger.stream().filter(j->j%2 !=0).distinct().collect(Collectors.toList());
	System.out.println("List of Odd integer"+oddList);
	
	
	System.out.println("==========================================================");
	
	int n=8;
	if((n&1) == 0) {
	System.out.println("Even no ");
	}
	else {
		
		System.out.println("Odd no ");
	}

	
	

	
	
	
	
	}
	
	

	
	

}
