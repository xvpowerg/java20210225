/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210401.ch11_1_initblock;

/**
 *
 * @author xvpow
 */
public class TestInitBlockOrder {
    {
	System.out.println("Not Static Init1");
	
    }
    static {
      System.out.println("Static Init1");
    }
    {
	System.out.println("Not Static Init2");
    }
    static{
	 System.out.println("Static Init2");
    }
    TestInitBlockOrder(){
	 System.out.println("TestInitBlockOrder()");
    }
}
