/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20200311;

/**
 *
 * @author xvpow
 */
public class Ch5_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//字串轉整數
	String number = "12";
	//字串轉整數
	int v = Integer.parseInt(number);
	System.out.println(v);
	
	String number2 = " 52 ";
	//trim 可去除前後空格
	int v2 = Integer.parseInt(number2.trim());
	System.out.println(v2);
	//數字轉二進位
	String b = Integer.toBinaryString(10);
	System.out.println(b);
	//數字轉8進位
	String o = Integer.toOctalString(10);
	System.out.println(o);
	//數字轉16進位
	String h = Integer.toHexString(10);
	System.out.println(h);
    }
    
}
