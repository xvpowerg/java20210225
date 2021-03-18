/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210318.extend1;

/**
 *
 * @author xvpow
 */
public class Student extends Person{
    public Student(){
	
    }
    public Student(String name,int age,
	    float height){
//super()呼叫父類別建構子
//只能是第一行命令
	super(name,age,height);
//	setName(name);
//	setAge(age);
//	setHeight(height);
    }
}
