package com.jnit.training.inheritance;

import java.util.Scanner;


  class Car {
	  Scanner sc= new Scanner(System.in);
	 void getVehicleInformation() {
		 String vehicleColor = getVehicleColor();
		 System.out.println("Vehicle color is "+vehicleColor);
		 int vehiclePrice = getVehiclePrice();
		 System.out.println("Price of vehicle "+vehiclePrice);
	 }

	private int getVehiclePrice() {
		System.out.println("Enter vehicle price ");
		int price = sc.nextInt();
		return price;
	}

	private String getVehicleColor() {
		String  a;
		System.out.println("enter vehicle color");
		a = sc.next();
		return a;
	}
}
  class Bmw extends Car{
	  @Override
	void getVehicleInformation() {
		System.out.println("Vehicle price :"+50000);
		System.out.println("Vehicle color : Red");
	}
  }

public class Overridingexample1 {

	public static void main(String[] args) {
		Car car = new Car();
        car.getVehicleInformation();
		Bmw bmw = new Bmw();
		bmw.getVehicleInformation();
        
	}

}
