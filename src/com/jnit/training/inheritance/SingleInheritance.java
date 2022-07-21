package com.jnit.training.inheritance;

class Animal1{
	void cat() {
		System.out.println("cat meow");
	}
}
class Dog1 extends Animal1{
	void bark() {
		System.out.println("dog is barking");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		 Dog1 dog = new Dog1();
		 dog.cat();
		 dog.bark();

	}

}
