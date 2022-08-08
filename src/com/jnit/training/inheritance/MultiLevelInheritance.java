package com.jnit.training.inheritance;

class Animal{
	void eat() {
		System.out.println("cat is eating");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("dog is barking");
	}
}
class Puppy extends Dog{
	void sleep() {
		System.out.println("cow is sleeping");
	}


}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Puppy pup = new Puppy();
		pup.eat();
		pup.bark();
		pup.sleep();
		
		

	}

}

