/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch21_20210506.stream1;
import java.util.stream.Stream;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch21_5 {

    /**
     * @param args the command line arguments
     */
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
	Student st2 = new Student("Vivin");   
	st2.addBook(b3);	
	Student st3 = new Student("Joy");   
	st3.addBook(b4);
	st3.addBook(b5);
	
	ArrayList<Student> stList = new ArrayList<>();
	stList.add(st1);
	stList.add(st2);
	stList.add(st3);
	//去除重複 所有學生書本的數量
	//錯誤的	
	//long count = stList.stream().map(st->st.getBookStream()).distinct().count();
	//System.out.println(count);
	//flat 都是return Stream
	long bookCount = stList.stream().flatMap(st->st.getBookStream()).distinct().count();
	System.out.println(bookCount);
    }
    
}
