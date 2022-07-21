package com.jnit.training.Constructor;

class Person1 {
	int id;
	String name;

	Person1(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Employee1 extends Person1 {
	float salary;

	Employee1(int id, String name, float salary) {
		super(id, name);
		this.salary = salary;
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

class ThisAndSuper {
	public static void main(String[] args) {
		Employee1 emp1 = new Employee1(123, "usha", 67890f);
		emp1.display();
	}
}
