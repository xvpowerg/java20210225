/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch21_20210506.stream1;

/**
 *
 * @author xvpow
 */
public class Book {
    private String bookName;
    private int isbn;

    public String getBookName() {
	return bookName;
    }

    public int getIsbn() {
	return isbn;
    }

    public Book(String bookName, int isbn) {
	this.bookName = bookName;
	this.isbn = isbn;
    }

    @Override
    public String toString() {
	return "Book{" + "bookName=" + bookName + ", isbn=" + isbn + '}';
    }
    
    public int hashCode(){
	    return isbn+bookName.hashCode();
    }
    public boolean equals(Object obj){
	Book tmp = (Book)obj;
	
	return this.isbn == tmp.isbn && this.bookName.equals(tmp.bookName);
    }
    
}
