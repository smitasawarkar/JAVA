package com.streamApis.org;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MinMaxMethod {

	public static void main(String[] args) {
	List<Integer> listOfInteger = Arrays.asList(1,4,3,5,6,8,5,4,8,0,5,6,8,5,4,44,6,98,654,765,79,43,3,3,76);
	Integer maxNo = listOfInteger.stream().max(Comparator.naturalOrder()).get();
	Integer withoutusingMax = listOfInteger.stream().sorted(Comparator.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
	
	System.out.println("original list "+listOfInteger);
	System.out.println("Find the first largest no Using Max() :"+maxNo);
	System.out.println("Find the second largest no without using max method :: "+withoutusingMax);
	
	}

}
