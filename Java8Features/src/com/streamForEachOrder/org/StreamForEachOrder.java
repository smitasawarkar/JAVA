package com.streamForEachOrder.org;

import java.util.ArrayList;
import java.util.List;

public class StreamForEachOrder {

	public static void main(String[] args) {
		List<String> fruitlist =new ArrayList<String>();
		fruitlist.add("Apple");
		fruitlist.add("Banana");
		fruitlist.add("Orange");
		fruitlist.add("pinapple");
		
		fruitlist.stream().forEachOrdered(game -> System.out.println(game));

	}

}
