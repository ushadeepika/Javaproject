package com.jnit.training.scanner;

import java.util.Scanner;

class Person {
	void setPersonName(String firstname) {
		System.out.println("firstname="+(firstname));
	}
	void setPersonName(String firstname,String lastname) {
		System.out.println("firstname ="+firstname  +   " lastname=" + lastname);
	}
	void setPersonName(String firstname,String lastname,int age) {
		System.out.println("firstname="+firstname + " lastname="+lastname + " age="+age);
	}
}

public class Scanner4 {
	
	public static void main(String[] args) {
		Person p =new Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter firstname");
		String a =sc.next();
		p.setPersonName(a);
		System.out.println("enter lastname");
		String b =sc.next();
		p.setPersonName(a, b);
		System.out.println("age");
	    int c =sc.nextInt();
		p.setPersonName(a, b,c);
		sc.close();
	}

}
