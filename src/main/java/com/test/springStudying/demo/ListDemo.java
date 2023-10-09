package com.test.springStudying.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListDemo {

	public static void main(String args[]) {
		IntStream numbers = IntStream.range(2, 9);	
        
	
		
		//List<Integer> list = numbers.boxed().collect(Collectors.toList());
//	   list.forEach(System.out::println);
//	//   System.out.println("...As String...");
//	   
	   List<String> list2 = numbers.boxed().map(n -> "s-"+n).collect(Collectors.toList());
	   
	   list2.forEach(System.out::println);
	
	}
	
}
