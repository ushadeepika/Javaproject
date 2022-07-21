package com.jnit.training.inheritance;


import java.util.Scanner;


  class Manager {
	  Scanner sc= new Scanner(System.in);
	 void getInformation() {
		 String Managername = getManagername();
		 System.out.println("Manager name is "+Managername);
		 int Managersalary = getManagersalary();
		 System.out.println("Manager salary "+Managersalary);
	 }

	private String getManagername() {
		System.out.println("Enter manager name ");
		String Managername = sc.next();
		return Managername;
	}

	private int getManagersalary() {
		int a;
		System.out.println("enter manager salary");
		a = sc.nextInt();
		return a;
	}
}
  class Employee extends Manager{
	  @Override
	void getInformation() {
		System.out.println("Employee name =" +"rahul");
		System.out.println("Employee Salary=" +300000);
	}
  }

public class Overridingexample2 {

	public static void main(String[] args) {
		Manager man = new Manager();
        man.getInformation();
	    Employee emp = new Employee();
		emp.getInformation();
        
	}

}

