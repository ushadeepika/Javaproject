package com.jnit.training.interfaceConcept;
interface Mammal{
	void noOfLegs();
    void eat();
}
abstract class Dog implements Mammal{
	 void tail() {
		System.out.println("Dog has tail");
	}
}
abstract class Gorillas implements Mammal{
	 void color() {
		System.out.println("Gorillas are black");
	}
	
}
class Puppy extends Dog{

	@Override
	public void noOfLegs() {
		System.out.println("Puppy has four legs");
		
	}

	@Override
	public void eat() {
		
		System.out.println("Puppy eats pedigre");
	}
	
}
class Infant extends Gorillas{

	@Override
	public void noOfLegs() {
		System.out.println("Gorilla has four legs");
		
	}

	@Override
	public void eat() {
		System.out.println("Gorilla eats fruits");
		
	}
	
}
public class MammalInterface {

	public static void main(String[] args) {
		Mammal mam = new Puppy();
	    mam.noOfLegs();
	    mam.eat();
		Puppy pup = (Puppy)mam;
		pup.tail();
		//mam.noOfLegs();
		//mam.eat();
		Mammal mam1 = new Infant();
		Infant infant = (Infant)mam1;
		infant.color();
		 mam1.noOfLegs();
		 mam1.eat();
		
	 
	}

}
