package com.jnit.training.java8;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class StreamApi {
		  
		 public static void main(String[] args) {
		    List<String> fruits = new ArrayList<String>();
		    fruits.add("Apple");
			fruits.add("orange");
			fruits.add("Guava");
			fruits.add("mango");
			fruits.add("pineapple");
			fruits.add("kiwi");
		    
		    System.out.println("original list: " + fruits);
		    List<String> fruit = fruits.stream()
		                                .map(s -> String.valueOf(s))
		                                .filter(i -> i.equals("Apple"))
		                                .collect(Collectors.toList());
		  
		    System.out.println(fruit);
		   }
		
}
