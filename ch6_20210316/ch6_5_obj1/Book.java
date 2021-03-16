/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210316.ch6_5_obj1;

/**
 *
 * @author xvpow
 */
public class Book {
    String name;
    String isbn;    
    int price;
	    
    public void printInfo(){
	System.out.println(isbn+":"+name+":"+price);
    }
}
