package com.entity;

import java.io.Serializable;

public class Book implements Serializable {
	private int bookid;    //Declaring the variables
	private String booktitle;//Declaring the variables
	private int bookprice;//Declaring the variables
	private String bookgrade;//Declaring the variables
	
	
	//Set getters and Setters
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	public String getBookgrade() {
		return bookgrade;
	}
	public void setBookgrade(String bookgrade) {
		this.bookgrade = bookgrade;
	}

}
