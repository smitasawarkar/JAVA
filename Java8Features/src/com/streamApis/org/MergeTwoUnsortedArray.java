package com.streamApis.org;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArray {

	public static void main(String[] args) {
		int [] a= {1,4,3,6,6,7,86,5,4,33,24,98,45};
		int [] b= {13,14,53,36,6,7,86,5,4,23,24,98,55};
		int[] c= IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
		System.out.println("with duplicate elements"+Arrays.toString(c));
		
		System.out.println("============================");
		
		int[] d= IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
		System.out.println("with duplicate elements"+Arrays.toString(d));
	}

}
