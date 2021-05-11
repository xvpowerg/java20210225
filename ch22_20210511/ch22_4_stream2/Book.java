/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch22_20210511.ch22_4_stream2;

/**
 *
 * @author xvpow
 */
public class Book {
       private String name;
       private int price;

    public Book(String name, int price) {
	this.name = name;
	this.price = price;
    }

    public String getName() {
	return name;
    }

    public int getPrice() {
	return price;
    }
    
    public String toString(){
	return name+":"+price;
    }
}
