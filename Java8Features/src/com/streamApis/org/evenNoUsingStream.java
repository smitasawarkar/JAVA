package com.streamApis.org;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class evenNoUsingStream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,10,4,2,6,44,5,3,6,8,98,54,32,65,12,47);
		
		List<Integer> evenList =list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println("Even list is ......");
		System.out.println(evenList);
		
		 System.out.println("--------------------------------------------------------------------");	
		 List<Integer> oddList = list.stream().filter(j -> j%2 != 0).collect(Collectors.toList());
		 System.out.println("Odd List is ....");
		 System.out.println(oddList);
		 
		 System.out.println("--------------------------------------------------------------------");
		 List<Integer> greaterNo = list.stream().filter(k->k>10).collect(Collectors.toList());
		 System.out.println("Greater than 1o List is ..");
		 System.out.println(greaterNo);
		 
		 
		 System.out.println("--------------------------------------------------------------------");
		
		 String name[]= {"Smita","sakshi","Amrita","Pratik","Samarth"};
		 Stream<String> nameList = Stream.of(name);
		 StringJoiner sj= new StringJoiner(",","[","]");
		
		 nameList.forEach(e ->sj.add(e));
		 System.out.println("print String with String Joiner in [  , ] this bracket");
		 System.out.println(sj);
		
		 System.out.println("--------------------------------------------------------------------");
		  
		 List<String> list2 = List.of("Smita","Sakshi","Amrita","Pratik","Samarth");
		 List<String> startWith = list2.stream().filter(e-> e.startsWith("S")).collect(Collectors.toList());
		 System.out.println("print String start with S");
		 System.out.println(startWith);
		
		 System.out.println("--------------------------------------------------------------------");
		  
		 List<String> endsWith = list2.stream().filter(e-> e.endsWith("a")).collect(Collectors.toList());
		 System.out.println("print String End with a");
		 System.out.println(endsWith);
		 
		 System.out.println("--------------------------------------------------------------------");
		 
		 System.out.println("Print lower Case String");
		  list2.stream().map(String::toLowerCase).forEach(str -> System.out.println(str));
		 System.out.println("--------------------------------------------------------------------");
		 
		 System.out.println("Print String in Upper Case ");
		 list2.stream().map(String :: toUpperCase).forEach(str -> System.out.println(str));
		 
		 System.out.println("--------------------------------------------------------------------");
		 
		 System.out.println("Print String length having greter than 5");
		 list2.stream().filter(x-> x.length()> 5).forEach(y-> System.out.println(y));
		 
		 System.out.println("--------------------------------------------------------------------");
		 List<Integer> numList = List.of(2,4,1,5,7,8,9,0,33,3);
		 List<Integer> numSquerList = numList.stream().map(i-> i*i).collect(Collectors.toList());
		 System.out.println("print squar of each no with map() method");
		 System.out.println(numSquerList);
		 
		 System.out.println("--------------------------------------------------------------------");
		 System.out.println("sort the No with sorted() method");
		numList.stream().sorted().forEach(System.out::println);
		
		 System.out.println("--------------------------------------------------------------------");
		 
		 System.out.println("Print maxNo ");
		 Integer maxNo = numList.stream().max((a,b)->a.compareTo(b)).get();
		 System.out.println(maxNo);
		 
		 System.out.println("Print minNo ");
		 Integer minNo = numList.stream().min((a,b)->a.compareTo(b)).get();
		 System.out.println(minNo);
		 
		 System.out.println("--------------------------------------------------------------------");
		 System.out.println("Print 1 to 10 no using range method");
		 IntStream.range(1, 10).forEach(n -> System.out.print(n));
		 System.out.println("--------------------------------------------------------------------");
		 
		 IntSummaryStatistics SummaryStatistic = (IntSummaryStatistics) IntStream.of(1,2,34,5,8,4,7,0,6,4,3,9).summaryStatistics();
		 System.out.println("\n "+SummaryStatistic);
		 
		
	}



}
