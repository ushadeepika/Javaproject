package com.jnit.training.abstractClass;

abstract class Shape {
	int  length = 23, width = 53, radius = 12, breath = 63, height = 71;
	double pie = 3.14;

	 abstract void calculateArea();//absract method

	static void display() {//static method inside abstract class
		System.out.println("This is a display method");
		
	}
} 
class Rectangle extends Shape {
	void calculateArea(int length,int width) {
		
	}

	@Override
	void calculateArea() {
		System.out.println("Area of Rectangle=" + length * width);
		
	}
}

 class Circle extends Shape {
	void calculateArea(double pie,int radius) {
		
	}

	@Override
	void calculateArea() {
		System.out.println("Area of Circle=" + pie * radius * radius);
		
	}
}

class Triangle extends Shape {
	void calculateArea(int breath,int height) {
	
	}

	@Override
	void calculateArea() {
		System.out.println("Area of triangle "+0.5*length*height);
	}
}

public class AbstractShape {

	public static void main(String[] args) {
		Shape.display();
		Triangle triangle = new Triangle();
		triangle.calculateArea();
		Rectangle rectangle = new Rectangle();
		rectangle.calculateArea();
		Circle circle = new Circle();
		circle.calculateArea();

	}

}
