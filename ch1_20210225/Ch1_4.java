/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20210225;

/**
 *
 * @author xvpow
 */
public class Ch1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	int a = 10,b = 5;
	System.out.println(a > b);
	System.out.println(a < b);
	System.out.println(a >= b);
	System.out.println(a <= b);
	//不等於
	System.out.println(a != b);
	System.out.println(a == b);
	
	//int x = y = z = 10; //錯誤
	//int y,z;
	//int x = y = z = 10;
	
	
	String st1 = "Ken";//0xFF1122
	String st2  = "Ken";//0xFF1122
	String st3 = new String("Ken");
	System.out.println(st1);
	System.out.println(st2);
	System.out.println(st3);
	//在參考型態是比較記憶體位置是否相同==
	System.out.println(st1 == st2);
	System.out.println(st2 == st3);
	
	System.out.println(st1.equals(st2));
	System.out.println(st2.equals(st3));
	
	//小心null
	String st4 = null;
	String st5="Ken";
	System.out.println(st4.equals(st5));
	//System.out.println(st5.equals(st4));
    }
    
}
