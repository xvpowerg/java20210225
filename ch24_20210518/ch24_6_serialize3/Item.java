/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch24_20210518.ch24_6_serialize3;
import java.io.Serializable;
//加上Serializable 無預設建構式
//加上預設建構式 無Serializable
/**
 *
 * @author xvpow
 */
public class Item  {
    private int id;
//    public Item(){
//	id =  -1;
//    }
    public Item(int id){
	this.id = id;
    }

    public int getId() {
	return id;
    }
    
}
