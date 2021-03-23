/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210323.modifier.test;
import ch8_20210323.modifier.Test1;
/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
    public void readValue(){
	System.out.println(this.publicValue);	
	System.out.println(this.protectedValue);
    }
    
    public void testMethod(){
	this.testProtected();
	this.testPublic();
    }
}
