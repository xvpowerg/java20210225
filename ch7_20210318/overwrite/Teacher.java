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
public class Teacher extends  Person{
    //建構子
    public Teacher(){
	
    }
    
    public Teacher(String name,int age,float height){
	super(name,age,height);
    }
    //輸出 姓名 年齡 身高 
    //@Override 表示 是否為正確的覆寫
    @Override
    public void printInfo(){
	System.out.print("老師：");
	super.printInfo();
    }
    
}
