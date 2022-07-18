package com.jnit.training;
class BookStore{
	
	void search() {
		System.out.println("1.novel\n2.science book\n3.english books");
	}
	void search(String bookName) {
		System.out.println("Searching for ="+bookName);
	}
	void bookFound(String bookName) {
	     System.out.println("book found in library="+bookName);
	}
	void bookFound(String bookName,String bookname1) {
	     System.out.println("books found in library="+bookName + " and "+bookname1);
	}
	int rentBook() {
		System.out.println("Rent the book");
		int noofdays=2;
		return  noofdays;
	}
	int rentBook(int noofbooks) {
		System.out.println("no of books renting="+noofbooks);
		int noofdays=2*noofbooks;
		return  noofdays;
	}
	int bill(String bookname) {
		System.out.println("Billing for book "+bookname);
		return 20;
		
	}
	int bill(String bookname,int noofdaysrented) {
		System.out.println("Billing for book "+bookname + " and "+noofdaysrented);
		return 20*noofdaysrented;
		
	}
	
}

public class Student {

	public static void main(String[] args) {
		BookStore bookStore = new BookStore();
		bookStore.search();
		bookStore.search("science book");
		bookStore.bookFound("book1");
		bookStore.bookFound("novel","science");
		System.out.println(bookStore.rentBook());
		System.out.println("renting book for days ="+bookStore.rentBook(10));
		System.out.println("abdulkalam");
		System.out.println("amount to payed="+bookStore.bill("novel",30));
		

	}

}
