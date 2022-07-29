package com.jnit.training.abstractClass;

abstract class Animal {
	 abstract void lifeSpan();

	void breadth() {
		System.out.println("Takes the oxygen");
	}
}

class Cat extends Animal {
	void lifeSpan() {
		System.out.println("lifespan of cat is 25 years");
	}
}

class Dog extends Animal {
	void lifeSpan() {
		System.out.println("lifespan of dog is 30 years");
	}

}

public class AbstractAnimal {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.lifeSpan();
		cat.breadth();
		Dog dog = new Dog();
		dog.lifeSpan();
		dog.breadth();

	}

}
