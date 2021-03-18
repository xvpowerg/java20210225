/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210318.overwrite;

import ch7_20210318.extend1.*;
import ch7_20210318.obj.*;

/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    private int age;
    private float height;
    //default Constructor
    public Person(){
	//呼叫其他Constructor 
	//this()呼叫目前物件中的其他Constructor
	//只能放在建構式的第一個命另
	this("未命名",0,0);
	System.out.println("Person()!");	
	
    }
    public Person(String name,int age,float height){
	setName(name);
	setAge(age);
	setHeight(height);
    }
    public void setName(String name){
	//this. 表示當前物件
	    this.name = name;
    }
    public String getName(){
	return name;
    }    
    public void setAge(int age){	
	this.age = age;
    }
    public int getAge(){
	return age;
    }
    public void setHeight(float height){
	this.height = height;
    }
    public float getHeight(){
	return height;
    }    
    public void printInfo(){
	System.out.printf("Name:%s Age:%d Height:%.2f%n",
			getName(),getAge(),getHeight());
    }
}
