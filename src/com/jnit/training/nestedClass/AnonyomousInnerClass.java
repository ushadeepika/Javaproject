package com.jnit.training.nestedClass;

class Fruit {
	public void mango() {

	}

	public void apple(String color, String taste) {

	}
}

public class AnonyomousInnerClass {

	public static void main(String[] args) {
		Fruit fruit = new Fruit() {
			public void mango() {
				System.out.println("Mango is sour");
			}

			public void apple(String color, String taste) {
				System.out.println("Apple color =" + "red" + "  taste is=" + "sweet");

			}

		};
		fruit.mango();
		fruit.apple(null, null);
	}
}
