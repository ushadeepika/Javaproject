package com.jnit.training.abstractClass;

abstract class Doggy {
	abstract void addFeatures(String color, String bread, double height);// parameterized constructor
	Doggy(){//Default constructor
		System.out.println("Iam dog constructor");
	}
}

class Puppy extends Doggy {

	Puppy(String Name){//parameterized constructor
		
		System.out.println("Iam Puppy constructor");
	}
	@Override
	void addFeatures(String color, String bread, double height) {
		System.out.println(color + " " + bread + " " + height);

	}

}

public class ConstructorAbstract {

	public static void main(String[] args) {
		Puppy pup = new Puppy("snupy");
		pup.addFeatures("white", "germanshepard", 3.2);
	}
}