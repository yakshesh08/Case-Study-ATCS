package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.entity.Book;


public class BookDAO {
	 public int addBook(Book book) //10.
	  {	  Connection con = null;
		  PreparedStatement pstmt = null;
		  try
		  {  
			  con=BookDB.getConnection(); //11,
			  //con  15.
			  String ins_str = "insert into book values(?,?,?,?)";
			 
			  pstmt = con.prepareStatement(ins_str);
			  pstmt.setInt(1,book.getBookid());
			  pstmt.setString(2,book.getBooktitle());
			  pstmt.setFloat(3,book.getBookprice());
			  pstmt.setString(4,book.getBookgrade());
			  int updateCount = pstmt.executeUpdate();  //16,
			       //17.
			  con.close();
			  return updateCount; //18
		  }
		  catch(Exception ex)
		  {
			  System.out.println(ex.toString());
			  return 0;
		  }
	  }
	 // Below method, Search by ID Module.    
	  public ArrayList getBookDetailsById(int bookId)
				throws Exception
				{
					Connection con = null;
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					
					con = BookDB.getConnection();
					
			    String sel_str ="Select producttitle,productprice from product where productId=?";
					  
					  
					  pstmt = con.prepareStatement(sel_str);
					  pstmt.setInt(1,bookId);
					  rs = pstmt.executeQuery();
					  
					  ArrayList result = new ArrayList();
					  if(rs.next())
					  {
						  result.add(rs.getString(1));
						  result.add(rs.getString(2));
						  
					  }
					  else
					  {
						  result.add("Invalid Id");
					  }
					  return result;
					
				}
}
