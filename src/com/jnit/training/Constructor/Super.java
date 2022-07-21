package com.jnit.training.Constructor;

class vehicle {
	int speed = 120;

}

class Car extends vehicle {
	int speed = 125;
	String color = "Black";
	String brand = "Tesla";

	void printspeed(String color) {
		System.out.println(speed);
		System.out.println(this.color);
		System.out.println(brand);
		System.out.println(super.speed);
	}
}

public class Super {

	public static void main(String[] args) {
		Car c = new Car();
		c.printspeed("white");
	}

}
