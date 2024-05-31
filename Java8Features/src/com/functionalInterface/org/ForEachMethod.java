package com.functionalInterface.org;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		List<String> gameList = new ArrayList<String>();
		gameList.add("Football");
		gameList.add("Cricket");
		gameList.add("chess");
		gameList.add("Hocky");
		
		gameList.forEach(game -> System.out.println(game));
		

	}

}
