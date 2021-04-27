/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17_20210422.ch17_1_TreeSet;

public class Item implements Comparable<Item>{
    private String name;
    private int price;
    private int count;
     
    //假設 當前物件大於 傳入物件回傳正數
    //假設 當前物件小於 傳入物件回傳負數
    //假設 當前物件等於 傳入物件回傳0
    public int compareTo(Item tmp){
	if (this.price > tmp.price){
	    return 1;
	}else if(this.price < tmp.price){
	    return -1;
	} else if(this.count > tmp.count){
	    return 1;
	}else if(this.count < tmp.count){
	    return -1;
	}
	return name.compareTo(tmp.name);
    }
    
    
    Item(String name,int price,int count){
	this.name = name;
	this.price = price;
	this.count = count;
    }
    
    public String toString(){
	return this.name+":"+this.price+":"+count;
    }

}
