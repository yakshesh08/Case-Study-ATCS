package com.service;

import com.dao.BookDAO;
import com.entity.Book;

public class BookService {
	
	//Creating method to add book
	public int addBookService(int bookid,String booktitle, int bookprice) {
		
		String bookgrade="";
		//Applying condition if price is less then equals to 1000 then grade is low range
		if (bookprice<=1000) {
			bookgrade="Low Range book";
		}
		//Applying condition if price is less then equals to 2000 then grade is Med range
		else if(bookprice<=2000) {
			bookgrade="Medium Range Book ";
		}
		else
		{
			bookgrade="High Range Book";
		}
		
		//Creating the object refrence
		BookDAO bDAO = new BookDAO();
		Book book=new Book();
		
		//now seting or wrapping the data into Book class
		book.setBookid(bookid);
		book.setBooktitle(booktitle);
		book.setBookgrade(bookgrade);
		
		int updateResult=0;
		try
		{
			updateResult=bDAO.addBook(book);
			return updateResult;
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
			return 0;
		}
	}

}
