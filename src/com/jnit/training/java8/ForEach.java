package com.jnit.training.java8;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ForEach {

	public static void main(String[] args) {
		 PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		 ArrayDeque<String> ad = new ArrayDeque<String>();
          pq.add(20);
          pq.add(35);
          pq.add(46);
          pq.add(46);
          pq.add(78);
          pq.forEach(value ->System.out.println(value));
       
          ad.add("java");
          ad.add("developer");
          ad.add("fullstack");
          ad.add("developer");
          
          ad.forEach(value -> System.out.println(value));
	}


	}


