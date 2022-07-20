package com.jnit.training.scanner;

import java.util.Scanner;

;

class Bank{
	void availableForms() {
		System.out.println("1.Deposit form\n2.Withdrawal Form\n3.Transfer Form");
	}
	void submitForm(String formName) {
		System.out.println("Received form for "+formName);
	}
	String deposit(int amount) {
		System.out.println("Deposited Amount :"+amount );
		return "success";
	}
	boolean provideReceipt() {
		return true;
	}
}

public class Scanner5 {

	public static void main(String[] args) {
		Bank sbi = new Bank();
		sbi.availableForms();
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		System.out.println("User Entered : "+userInput);
	    System.out.println("enter submitform");
	    String b = sc.next();
		sbi.submitForm(b);
		System.out.println("enter deposit amount");
	    int c = sc.nextInt();
        System.out.println("Transaction status="+sbi.deposit(c));
        sc.close();

	}

}

