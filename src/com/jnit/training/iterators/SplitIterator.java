package com.jnit.training.iterators;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SplitIterator {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("java");
		list.add("developer");
		list.add("fullstack");
		list.add("frontend");
		list.add("backend");

	
		
		Spliterator<String> split = list.spliterator();
        System.out.println("estimate size : " + split.estimateSize());
		System.out.println("exact size : " + split.getExactSizeIfKnown());
		System.out.println(split.hasCharacteristics(split.characteristics()));
		System.out.println(split.equals(split));
		Spliterator<String> spliterator = list.spliterator();
		Spliterator<String> spliterator1 = spliterator.trySplit();
		spliterator1.forEachRemaining(System.out::println);
		spliterator1.forEachRemaining(System.out::println);
	    
	}

}
