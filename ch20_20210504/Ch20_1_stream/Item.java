/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch20_20210504.Ch20_1_stream;

/**
 *
 * @author xvpow
 */
import java.util.Random;
public class Item {
    private String name;
    private int value;

    public Item(String name, int value) {
	this.name = name;
	this.value = value;
    }

    public static Item createItem(){
	Random ran = new Random();
	int n = ran.nextInt(50000);
	return new Item("name:"+n,n);
    }
    
    public String getName() {
	return name;
    }

    public int getValue() {
	return value;
    }

    @Override
    public String toString() {
	return "Item{" + "name=" + name + ", value=" + value + '}';
    }
    
}
