/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210316;

/**
 *
 * @author xvpow
 */
public class Ch6_1 {


    public static void main(String[] args) {
	String str = "true";
	boolean b1 = Boolean.parseBoolean(str);
	System.out.println(b1);
	String str2 = "tRUe";
	boolean b2 = Boolean.parseBoolean(str2);
	System.out.println(b2);
	//只要不是true就回傳false
    }
   
}
