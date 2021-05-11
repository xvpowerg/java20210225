/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch22_20210511.ch22_4_stream2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Ch22_4 {

    public static void main(String[] args) {
	// TODO code application logic here
	Book b1 = new Book("Book1",60);
	Book b2 = new Book("Book2",75);
	Book b3 = new Book("Book3",82);
	Book b4 = new Book("Book4",65);
	Book b5 = new Book("Book5",79);
	Book b6 = new Book("Book6",66);
	ArrayList<Book> list = new ArrayList<>();
	list.add(b1);
	list.add(b2);
	list.add(b3);
	list.add(b4);
	list.add(b5);
	list.add(b6);
	
Map<Integer,List<Book>>	 map = 
	list.stream().
		collect(Collectors.groupingBy(b->b.getPrice()/10*10));
	
map.forEach((k,v)->System.out.println(k+":"+v));
	
Map<Integer,Long> countMap = list.stream().collect(Collectors.groupingBy(b->b.getPrice()/10*10, 
		Collectors.counting()));
System.out.println(countMap);
//二分
Map<Boolean,List<Book>> 
	boolMap = 
	list.stream().collect(Collectors.partitioningBy(v->v.getPrice() < 70));
boolMap.forEach((k,v)->System.out.println(k+":"+v));
String bookList = list.stream().map(b->b.toString()).collect(Collectors.
	joining(",", "BookList:", "."));
System.out.println(bookList);
    }
    
}
