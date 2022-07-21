package com.jnit.training.Constructor;
class Person{
	int age;
	String name;
	String address;
public Person() {
   age = 30;
   name = "Ben";
   address = "NJ,07002";
}

}
class Employee extends Person{
	int salary;
	String employee_role;

}

public class DefaultConstructor {

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.age);
		System.out.println(person.name);
		System.out.println(person.address);
		Employee emp = new Employee();
		System.out.println(emp.salary);
		System.out.println(emp.employee_role);
		
		
		

	}

}


