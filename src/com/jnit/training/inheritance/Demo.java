package com.jnit.training.inheritance;

import java.util.Objects;

public class Demo {
	static int a = 10, b = 20;
	int c = 20, d = 30;

	public static void main(String[] args) {
    	Demo d = new Demo();
    	System.out.println("d "+d.toString());
		Demo d1 = new Demo();
		System.out.println("d1 before change "+d1.toString());
		System.out.println("d==d1 before change "+d.equals(d1));
		d1.d=40;
		System.out.println("d1 after change "+d1.toString());
		System.out.println("d==d1 after change "+d.equals(d1));
	}



	@Override
	public String toString() {
		return "Demo [c=" + c + ", d=" + d + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(c, d);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demo other = (Demo) obj;
		return c == other.c;
	}



	public void add() {
		System.out.println(c+d);
		System.out.println(Demo.a+Demo.b);
	}
}

class Example {
	int id = 10;
}

