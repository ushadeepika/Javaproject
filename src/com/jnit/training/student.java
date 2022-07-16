package com.jnit.training;
class Library{
	
	void search() {
		System.out.println("1.novel\n2.science book\n3.english books");
	}
	void bookFound(String bookName) {
	     System.out.println("book found in library="+bookName);
	}
	int rentBook() {
		System.out.println("Rent the book");
		int noofdays=2;
		return  noofdays;
	}
	int bill(String bookname) {
		System.out.println("Billing for book "+bookname);
		return 20;
		
	}
	
	
}

public class student {

	public static void main(String[] args) {
		Library L = new Library();
		L.search();
		L.bookFound("novel");
		System.out.println("renting book for days ="+L.rentBook());
		System.out.println("amount to payed="+L.bill("novel"));
		

	}

}
