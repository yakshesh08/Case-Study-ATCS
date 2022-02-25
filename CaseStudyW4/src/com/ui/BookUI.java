package com.ui;

import java.util.Scanner;

import com.service.BookService;

public class BookUI {

	public static void main(String[] args) {
		int bookid=0;
		String booktitle="";
		int bookprice=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book Id:");
		bookid=sc.nextInt();
		System.out.println("Enter Book title:");
		booktitle=sc.next();
		System.out.println("Enter Book Price:");
		bookprice=sc.nextInt();
		
		BookService bookservice = new BookService();
		int updateCount=bookservice.addBookService(bookid,booktitle,bookprice);
		System.out.println("Inserted:"+updateCount+" Record Success");
		
	}
}



/*
OutPut:
Enter Book Id:
123
Enter Book title:
uuu
Enter Book Price:
9874
Inserted1 Record Success


DB output
 bookid | booktitle | bookprice |    bookgrade
--------+-----------+-----------+-----------------
    123 | uuu       |         9874 | High Range Book
(1 row)


cs=#
*/
