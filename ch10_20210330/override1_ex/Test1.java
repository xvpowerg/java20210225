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
public class Test1 {
    public void fun()throws IOException{
	System.out.println("Test1");
    }
    
    public void fun2(int v)throws MyException{
	if (v > 10){
	    throw new MyException("錯誤!");
	}
    }
}
