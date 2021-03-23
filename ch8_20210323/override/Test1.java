/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210323.override;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public void publicMethod(){
	System.out.println("T1 publicMethod!!");
    }
    protected void testProtected(){
	System.out.println("T1 Protected!!");
    }
    
    void testDefault(){
	System.out.println("T1 Default");
    }
    
   private void testPrivate(){
       System.out.println("T1 Private");
   }
}
