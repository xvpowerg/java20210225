/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210323.test2;

import ch8_20210323.test1.*;

/**
 *
 * @author xvpow
 */
public class Test1 {
    //可宣告新屬性
    private float v1;
    private int v2;
    public Test1(float v1,int v2){
	System.out.println("Test1 float int Constructor");	
	this.v1 = v1;
	this.v2 = v2;
    }
    
    public Test1(float v1){
	this(v1,16);
	System.out.println("Test1 Constructor");	
    }
    public void printValue(){
	System.out.println("v1:"+v1+"v2:"+v2);
	
    }
}
