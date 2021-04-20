/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210420.ch16_1_list;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    private int price;
    Item(String name,int price){
	this.name = name;
	this.price = price;
    }
    public String toString(){
	return name+":"+price;
    }
    
    public boolean equals(Object obj){
	if (obj == null || obj instanceof Item == false){
	    return false;
	}
	Item tmp = (Item)obj;
	return this.price == tmp.price && this.name.equals(tmp.name);
    }
}
