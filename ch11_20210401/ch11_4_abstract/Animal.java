/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210401.ch11_4_abstract;

/**
 *
 * @author xvpow
 */
public  abstract  class Animal {
    private String  name;
    private int height;
    Animal(String name,int height){
	this.name = name;
	this.height = height;
    }
   public abstract void skill();	 

public String toString(){
    return name+":"+height;
}   
}
