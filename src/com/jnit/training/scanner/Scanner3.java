package com.jnit.training.scanner;

import java.util.Scanner;

class Library{
	
	void search() {
		System.out.println("1.novel\n2.science book\n3.english books");
	}
	void bookFound(String bookName) {
	     System.out.println("book found in library="+bookName);
	}
	int bill(String bookname) {
		System.out.println("Billing for book "+bookname);
	return 20	;
		
	}
	int rentBook() {
		System.out.println("Rent the book");
		int noofdays=2;
		return  noofdays;
	}
	
	
}

public class Scanner3 {

	public static void main(String[] args) {
		Library L = new Library();
		L.search();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter searching books");
		String userInput = sc.next();
		System.out.println("User Entered : "+userInput);
		System.out.println("enter bookfound");
		String b=sc.next();
		L.bookFound(b);
		System.out.println("enter bookname");
	    String c = sc.next();
        System.out.println("Transaction status="+L.bill(c));
        sc.close();

	}

}
