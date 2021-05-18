/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch24_20210518.ch24_6_serialize3;
import ch24_20210518.ch24_4_serialize2.*;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Order extends Item implements Serializable  {
    private String userName;
    private int price;

    public Order(int id,String userName, int price) {
	super(id);
	this.userName = userName;
	this.price = price;
    }
    
    public String toString(){
	return this.getId()+":"+userName+":"+price;
    }
    
}
