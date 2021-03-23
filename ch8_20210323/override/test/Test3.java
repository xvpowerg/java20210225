/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210323.override.test;
import ch8_20210323.override.Test1;
//請問以下有幾個Override! 2個publicMethod testProtected
public class Test3  extends Test1 {
    public void  publicMethod(){
	
    }
    
    protected void  testProtected(){
	
    }
    //因為 Default 只能在相同package被發現
    void testDefault(){
	System.out.println("Test Default");
    }
     private void testPrivate(){
	System.out.println("Test Private");
    }
}
