package com.jnit.training.nestedClass;



class College{//outer class
	String name;
	String standard;
	void teacher() {
		System.out.println("teacher name="+"sudha");
	
	class Student{//local inner class inside the method
		void StudentDetails() {
			System.out.println("student name ="+"Rohan"+ "Standard="+" 12th standard");
		}
		
	}
	Student stud = new Student();//we can't create object in main method for local inner class bcz local class is within the class
		stud.StudentDetails();
		
	}
	}
	

public class LocalInnerClass {

	public static void main(String[] args) {
		College jnit = new College();
        jnit.teacher();
        

	}

}
