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
public class Ch1_1 {
    public static void main(String[] args) {
	//基本型態
	//整數
	//byte 8bit -128~127
	//short 16bit
	short s1 =  256;
	//int 32bit 
	int v2 = 65535;//整數預設情況下為int
	//long 64bit
	long v3 = 2147483648L;
	//浮點數
	//float 32bit
	float point = 35.26f;
	System.out.println("point:"+point);
	//double 64bit
	double pi = 3.1415967;//預設為double
	System.out.println("pi:"+pi);
	//文字
	//char 16bit 0~65535
	   char c1 = 'A';
	   char c2 = 65;
	   final byte b2 = 75;	   
	   char c3 = b2;
	   System.out.println(c2);
	   System.out.println(c3);
	//boolean 
	    boolean isOpen = false;
	    
	   //變數名稱規則
	//開頭可以是_ $ 英文字母 
	//第二個字母開始可以是_ $ 英文字母 數字
	    int $$_$$ = 1564;
	    int a12345 = 10;
	    
	//參考型態 比較重
	String str="AAA";	
	System.out.println(str);
	
	
	
	
    }
    
}
