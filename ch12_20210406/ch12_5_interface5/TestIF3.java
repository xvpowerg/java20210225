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
public interface TestIF3 extends TestIF,TestIF2 {
    public boolean test(int v);
    
    public static TestIF3 newTestIF3(int inV){	
	 return (int v)->v == inV;
    }
}
