/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210318.overwrite;

import ch7_20210318.extend1.*;

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
    
    
   public void printInfo(){
       //super. 呼叫父類別的public方法
       System.out.print("學生:");
      super.printInfo();
//       System.out.printf("學生:Name:%s Age:%d Height:%.2f%n",
//	       getName(),
//	       getAge(),
//	       getHeight());
   }
}
