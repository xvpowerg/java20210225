/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210325.ch9_1_override1;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public Test1 newTest(){
	return new Test1();
    }    
    public void print(){
	System.out.println("Test1");
    }
}
