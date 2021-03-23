/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210323.modifier;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public String publicValue = "T1 Public";
    protected String protectedValue = "T1 protected";
    String defaultValue = "T1Defaule";    
    private String privateValue = "T1Private"; 
    
    public void testPublic(){
	System.out.println("T1 public");
    }
    protected void testProtected(){
	System.out.println("T1 Protected");
    }
     void defaultMethod(){
	 System.out.println("T1 Default");
     }
     private void privateMethod(){
	 System.out.println("T1 private");
     }
}
