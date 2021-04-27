/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17_20210422.ch17_7_comp;

/**
 *
 * @author xvpow
 */
public class Item implements Comparable<Item>{
    private int value;
    public Item(int vlaue){
	this.value = value;
    }
    public int getValue(){
	return value;
    }
    
    public String toString(){
	return value+"";
    }

    @Override
    public int compareTo(Item o) {
	return this.value - o.value;
    }
	    
}
