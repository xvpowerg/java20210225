  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210406.ch12_5_interface5;

/**
 *
 * @author xvpow
 */
public interface TestIF {
   // void myTest();
    //靜態無法呼叫非靜態的
    static void testStatic(){
	System.out.println("TestIF testStatic");
    }
}
