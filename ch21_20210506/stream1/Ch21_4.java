/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch21_20210506.stream1;
import java.util.ArrayList;
import java.util.List;
public class Ch21_4 {

    public static void main(String[] args) {
	// TODO code application logic here
	Book b1 = new Book("Golang",25123);
	Book b2 = new Book("Php",56112);
	Book b3 = new Book("Asp",38997);
	Book b4 = new Book("Servlet",65112);
	Book b5 = new Book("Golang",25123);
	
	Student st1 = new Student("Ken");   
	st1.addBook(b1);
	st1.addBook(b2);
	st1.addBook(b3);
	//不好的做法 因為List可改變 會影響資料正確性
	//List<Book> list = st1.getBooks();	
	//st1.getBooks().forEach(b->System.out.println(b));
	long count = 
		st1.getBookStream().
			filter(b->b.getBookName().equals("Php")).count();
	System.out.println(count);
	 
	
    }
    
}
