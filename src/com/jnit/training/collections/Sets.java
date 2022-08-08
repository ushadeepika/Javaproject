package com.jnit.training.collections;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		 HashSet<String> fruits = new HashSet<String>();
		 LinkedHashSet<String> flowers = new LinkedHashSet<String>();
		 TreeSet<Integer> numbers = new TreeSet<Integer>();
		 fruits.add("Apple");
		 fruits.add("orange");
		 fruits.add("Guava");
		 fruits.add("mango");
		 fruits.add("pineapple");
		 fruits.add("kiwi");
		 
		
		 numbers.add(42);
		 numbers.add(23);
		 numbers.add(32);
		 
		 flowers.add("lily");
		 flowers.add("rose");
		 flowers.add("jasmine");
		 
		 
		 System.out.println(fruits);
		 System.out.println(flowers);
		 System.out.println(numbers);
		 System.out.println(fruits.size());
		 //print the size of the methods
		 
		 System.out.println(fruits.remove("mango"));
		 //remove the method
		 
		 System.out.println(fruits);
		 System.out.println(flowers.removeAll(flowers));
		 //Removes all the methods
		 
		 System.out.println(flowers);
		 
		 System.out.println(numbers.first());
		 //print first value in the ascending order
		 
		 System.out.println(numbers.floor(30));
		 //return greatest element in the set lessthan or equal to given element
		 
		 System.out.println(numbers.lower(10));
		 //return element in the set but less than the given element if nothing is there returns null.
		 
         System.out.println(numbers.last());
         //return last value
         
         System.out.println(numbers.headSet(40));
         //return all the lesser values than given values
         
         System.out.println(numbers.tailSet(23));
         //return less than or equal higher values.
         
         System.out.println(numbers.subSet(13, 33));
         //return values between values
         
         System.out.println(numbers.pollFirst());
         //give first value in the ascending order
         
         System.out.println(numbers.pollLast());
         //give last value in the ascending order
         
         System.out.println(numbers.higher(45));
         //return element in the set but higher than the given element if nothing is there returns null.

	}

}
