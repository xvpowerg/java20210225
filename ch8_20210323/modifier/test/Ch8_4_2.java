/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210323.modifier.test;
import ch8_20210323.modifier.Test1;

public class Ch8_4_2 {

    public static void main(String[] args) {
	
	Test1 t1 = new Test1();
	//System.out.println(t1.publicValue);
	//t1.testPublic();
	
	Test2 t2 = new Test2();
	//t2.readValue();
	t2.testMethod();
    }
    
}
