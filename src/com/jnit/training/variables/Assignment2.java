package com.jnit.training.variables;

public class Assignment2 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.employeeId = 123;
		emp.employeeName = "Sahana";
		Employee.employeeRole = "Java Developer";
		emp.employeeSalary = 20000;
		System.out.println("employeeId="+emp.employeeId);
		System.out.println("employeeName="+emp.employeeName);
		System.out.println("employeeRole="+Employee.employeeRole);
		System.out.println("employeeId="+emp.employeeSalary );

		Employee emp1= new Employee();
		System.out.println("employeeId="+emp1.employeeId);
		System.out.println("employeeName="+emp1.employeeName);
		System.out.println("employeeRole="+Employee.employeeRole);
		System.out.println("employeeId="+emp1.employeeSalary );
	}

}
