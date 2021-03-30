/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210330.override1_ex;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch10_1 {

    public static void main(String[] args) {
	Test1 t1 = new Test2();
	try{
	 t1.fun();   
	}catch(IOException ex){
	    
	}
	try{
	    t1.fun2(20);
	}catch(MyException ex){
	    System.out.println(ex);
	}

    }
    
}
