/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210406.ch12_4_interface4;

/**
 *
 * @author xvpow
 */
public interface TestIF9 extends TestIF7,TestIF8 {
      default void testDefualt(){
	System.out.println("TestIF9");
    }
}
