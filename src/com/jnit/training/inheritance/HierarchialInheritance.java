package com.jnit.training.inheritance;

class Animal2{
	void sleep() {
		System.out.println("cat is sleeping");
	}
}
class Dog2 extends Animal2{
	void bark() {
		System.out.println("dog is barking");
	}
}
class Cow2 extends Animal2{
	void eat() {
		System.out.println("cow is eating grass");
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		Cow2 cow = new Cow2();
		cow.eat();
		cow.sleep();
		Dog2 dog = new Dog2();
		dog.bark();
		dog.sleep();
		
		

	}

}


