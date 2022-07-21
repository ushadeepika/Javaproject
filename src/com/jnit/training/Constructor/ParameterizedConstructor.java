package com.jnit.training.Constructor;

class Student {
	int id;
	String name;
	String schoolname;
	int age;

	public Student(int id, String name, int age, String schoolname) {
		this.id = id;
		this.name = name;
		this.schoolname = schoolname;
		this.age = age;
	}
	
	void display(Student s) {
	
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.schoolname);
		System.out.println("-------------------------");
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.schoolname);
	}
}

public class ParameterizedConstructor {
	public static void main(String[] args) {
		Student mystudent = new Student(111, "usha", 22, "srkr");

		Student mystudent1 = new Student(222, "deepu", 30, "vishnu");
		
		mystudent1.display(mystudent);
	}

}
