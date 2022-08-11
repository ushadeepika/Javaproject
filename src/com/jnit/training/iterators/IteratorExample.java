package com.jnit.training.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Orange");
		list.add("kiwi");
		list.add("pineapple");
		Iterator<String> it = list.iterator();
		System.out.println(it.next());
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		it.remove();
		System.out.println(list);
	}

}
