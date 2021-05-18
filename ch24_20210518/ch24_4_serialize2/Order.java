/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch24_20210518.ch24_4_serialize2;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Order implements Serializable  {
    private String userName;
    private int price;

    public Order(String userName, int price) {
	this.userName = userName;
	this.price = price;
    }
    
    public String toString(){
	return userName+":"+price;
    }
    
}
