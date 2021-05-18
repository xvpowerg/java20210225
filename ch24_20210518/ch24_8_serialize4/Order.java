/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch24_20210518.ch24_8_serialize4;
import ch24_20210518.ch24_4_serialize2.*;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Order implements Serializable  {
    private String userName;
    private int price;
    //transient 不參與序列化
    private transient User sales;
    public Order(User sales,String userName, int price) {
	this.userName = userName;
	this.price = price;
	this.sales  = sales;
    }
    
    public String toString(){
	return userName+":"+price+":"+sales;
    }
    
}
