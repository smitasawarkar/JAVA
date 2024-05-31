package com.streamApis.org;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortTheDecimalIntegerNo {

	public static void main(String[] args) {
		List<Double> decimalNo = Arrays.asList(21.2,34.3,11.3,66.5,76.4,47.6,1.2,4.3,0.2,9.5);
		decimalNo.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		List<Integer> intList= Arrays.asList(1,3,2,4,5,2,6,8,90,43,5,8,9,11,32);
		intList.stream().sorted().forEach(System.out::println);
		
		
		

	}

}
