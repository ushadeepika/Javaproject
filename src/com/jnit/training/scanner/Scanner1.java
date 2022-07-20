package com.jnit.training.scanner;

import java.util.Scanner;



public class Scanner1 {


		public static void main(String[] args) {
		
			 Scanner sc = new Scanner (System.in);
	        System.out.println("enter doctor_name");
	        String doctor_name = sc.next();
	        System.out.println(doctor_name);
	        System.out.println("enter specalisation");
	        String specalisation = sc.next();
	        System.out.println(specalisation);
	        System.out.println("enter hospital");
	        String hospital = sc.next();
	        System.out.println(hospital);	
	        System.out.println("enter patient_name ");
	        String patient_name = sc.next();
	        System.out.println(patient_name);
	        System.out.println("patient_id");
	        int patient_id = sc.nextInt();
	        System.out.println(patient_id);
	        sc.close();

		}

	}


