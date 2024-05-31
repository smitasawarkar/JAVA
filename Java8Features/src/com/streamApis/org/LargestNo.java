package com.streamApis.org;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNo {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(20,3,11,43,56,2,87,9,435,88,10,23);
		Integer largestNo = list.stream().sorted(Collections.reverseOrder()).distinct().findFirst().get();
		System.out.println(largestNo);
		
		Integer secLargestNo = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println(secLargestNo);
	}

}
