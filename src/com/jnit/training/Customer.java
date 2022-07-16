package com.jnit.training;
class Bank{
	void availableForms() {
		System.out.println("1.Deposit form\n2.Withdrawal Form\n3.Transfer Form");
	}
	void submitForm(String formName) {
		System.out.println("Received form for "+formName);
	}
	int deposit(int amount) {
		System.out.println("Deposited Amount");
		return amount;
	}
	boolean provideReceipt() {
		return true;
	}
}

public class Customer {

	public static void main(String[] args) {
		Bank sbi = new Bank();
		sbi.availableForms();
		sbi.submitForm("Deposit");
        System.out.println("Amount deposited= "+sbi.deposit(200));
        System.out.println("providereceipt="+sbi.provideReceipt());

	}

}
