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
public class Test1 {
    private Item item ;
    private int id;
    public Test1(int id){
	this.id = id;
	this.item = new Item(id);
    }
    public Item getItem(){
	return item;
    }
}
