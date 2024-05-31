package com.parallelSort.org;

import java.util.Arrays;

public class ParallelSortClass {

	public static void main(String[] args) {
	int[] arr = {7,3,6,2,5,9,1,0};
	for(int i: arr)
	{
	System.out.println(i+"");	
	}
	
	Arrays.parallelSort(arr);
	System.out.println("\nAfter sorting elements");
	for(int i : arr)
	{
		System.out.println(i +" ");
	}
	
	}

}
