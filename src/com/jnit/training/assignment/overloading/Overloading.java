package com.jnit.training.assignment.overloading;

class Person {
	void setPersonName(String firstname) {
		System.out.println("firstname="+(firstname));
	}
	void setPersonName(String firstname,String lastname) {
		System.out.println("firstname ="+firstname  +   " lastname=" + lastname);
	}
	void setPersonName(String firstname,String lastname,int age) {
		System.out.println("firstname="+firstname + " lastname="+lastname + " age="+age);
	}
}

public class Overloading{
	
	public static void main(String[] args) {
		Person p =new Person();
		p.setPersonName("nick");
		p.setPersonName("john", "saho");
		p.setPersonName("usha","goli",20);
		

	}

}
