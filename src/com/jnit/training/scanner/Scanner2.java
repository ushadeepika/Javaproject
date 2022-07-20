package com.jnit.training.scanner;

import java.util.Scanner;

public class Scanner2 {
	


		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("enter employeeId");
			int employee_Id = sc.nextInt();
	        System.out.println("Emplyee Id :" +employee_Id);
			System.out.println("enter employeeName");
			String employee_name = sc.next();
	        System.out.println("Employee name :"+employee_name);
			System.out.println("enter employeeRole");
			String employee_role = sc.next();
	        System.out.println("Employee Role :"+employee_role );
			System.out.println("enter employeeSalary");
			int employee_salary = sc.nextInt();
	        System.out.println("Employee salary:"+employee_salary );
            sc.close();
	

	}

}
