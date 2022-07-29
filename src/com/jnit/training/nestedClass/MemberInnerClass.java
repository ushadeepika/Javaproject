package com.jnit.training.nestedClass;
 class Shop {//outer class
	void Hp() {//outer class method
	System.out.println("price of Hp laptop");
	}
	 class Laptop{//Inner class
		void Seller() {//Inner class method
			System.out.println("price of laptop is 50k");
		}
	}
	}
 class Ram{
	 double memory= 4.3;
	 double internalMemory =9.3;
	 

	 class Rom{
		 void Size() {
			 System.out.println("size of rom is 2GB");
		 }
			 double getClockSpeed() {
				 return 5.5;
		 }
	 }
 }

public class MemberInnerClass {

	public static void main(String[] args) {
		Shop Reliance = new Shop();
		Shop.Laptop price = Reliance.new Laptop();
		Reliance.Hp();
		price.Seller();
		Ram ram = new Ram();
		System.out.println(ram.memory);
		System.out.println(ram.internalMemory);
		
		Ram.Rom memory = ram.new Rom();
		memory.Size();
		System.out.println(memory.getClockSpeed());
	}

}
