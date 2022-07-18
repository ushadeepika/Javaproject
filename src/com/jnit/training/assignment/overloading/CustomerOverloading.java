package com.jnit.training.assignment.overloading;
class GovernmentBank{
	
	void availableForms() {
		System.out.println("1.Deposit form\n2.Withdrawal Form\n3.Transfer Form");
	}
	
	void submitForm(String formName) {
		System.out.println("Received form for "+formName);
	}
	void submitForm(String formName1,String formName2,String formName3) {
		System.out.println("Received form for "+formName1 + " "+ formName2 + " "+  formName3);
	}
	String deposit(int totalamount) {
		System.out.println("Deposited Amount :"+totalamount );
		return "success";
	}
	String deposit(int amount, String accountNumber) {
		System.out.println("Deposited Amount :"+amount + " into account "+accountNumber);
		return "success";
	}
	boolean provideReceipt() {
		return true;
	}
	
}

public class CustomerOverloading {

	public static void main(String[] args) {
		GovernmentBank sbi = new GovernmentBank();
		sbi.availableForms();
		sbi.submitForm("Deposit");
		sbi.submitForm("Deposit", "Withdrawal", "Transfer");
        System.out.println("Transaction amount="+sbi.deposit(200000));
        System.out.println("Transaction amount for account="+sbi.deposit(100000, "123456789"));
        System.out.println("providereceipt="+sbi.provideReceipt());
	}

}
