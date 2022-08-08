package com.jnit.training.collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		 PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		 ArrayDeque<String> ad = new ArrayDeque<String>();
          pq.add(20);
          pq.add(35);
          pq.add(46);
          pq.add(46);//allows duplicate
          pq.add(78);
          
          //pq.add(null);//It doesn't allow null values
          System.out.println(pq);//display values in ascending order
          //System.out.println(pq.toArray(null));
          ad.add("java");
          ad.add("developer");//allows duplicate
          ad.add("fullstack");
          ad.add("developer");
          //ad.add(null);//It doesn't allow null values
          System.out.println(ad);//Give values in insertion order
         
	}


	}

