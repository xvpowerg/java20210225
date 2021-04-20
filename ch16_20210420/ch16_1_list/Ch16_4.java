/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210420.ch16_1_list;
import java.util.LinkedList;
public class Ch16_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	LinkedList<String> ls = new LinkedList<>();
	ls.add("A");
	ls.add("B");
	ls.add("C");
	ls.forEach(System.out::println);
	System.out.println("===============");
	ls.addFirst("Y");
	ls.addLast("X");
	ls.forEach(System.out::println);
	System.out.println("===============");
	//peek 類似getFirst()
	System.out.println(ls.peek());
	System.out.println(ls.peek());
	System.out.println("===============");
	   String v =null;
	while( (v = ls.poll()) !=null){
	    System.out.print(v+" ");
	}
	
//	System.out.println(ls.poll());
//	System.out.println("size:"+ls.size());
//	System.out.println(ls.poll());
//	System.out.println("size:"+ls.size());
    }
    
}
