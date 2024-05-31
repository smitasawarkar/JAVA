package com.ArrayList.org;

import java.util.ArrayList;
import java.util.HashSet;

public class RemovingDupolicateUsingArrayListAndSet {

	

	public static void main(String[] args) {
	ArrayList<Integer> duplicateElem = new ArrayList<>();
	duplicateElem.add(2);
	duplicateElem.add(2);
	duplicateElem.add(1);
	duplicateElem.add(3);
	duplicateElem.add(4);
	duplicateElem.add(4);	
	duplicateElem.add(5);	
	duplicateElem.add(6);	
	duplicateElem.add(8);
	duplicateElem.add(5);
	System.out.println("Duplicate Element List"+duplicateElem);
	 
	HashSet<Integer> withoutDuplicate =new HashSet<>(duplicateElem);
	duplicateElem.clear();
	
	duplicateElem.addAll(withoutDuplicate);
	System.out.println("without duplicate List"+duplicateElem);
	}

}
