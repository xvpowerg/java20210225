/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch21_20210506.stream1;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private List<Book> books;
    public Student(String name){
	this.name = name;
	books = new ArrayList();
    }
    
    public void addBook(Book book){
	books.add(book);
    }
    
    public List<Book> getBooks(){
	return books;
    }
    
    //好
    public Stream<Book> getBookStream(){
	return books.stream();
    }
    
}
