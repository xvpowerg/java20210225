/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20210304;

/**
 *
 * @author xvpow
 */
public class Ch3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//陣列的預設值
	//基本型態  預設值
	 //整數類型   0	 
	 //浮點數類型  0.0
	 //字元類型    空白字元
	 //布林類型    false
	//參考型態
	//一律為        null
	float[] f1 = new float[2];
	System.out.println(f1[1]);
	char[] c1 = new char[3];
	System.out.println(c1[2]);
	boolean[] bools= new boolean[2];
	System.out.println(bools[0]);
	//小心null
	String[] names = new String[3];
	System.out.println(names[1]);
	for (String  n : names){	    
	    if (n!=null && n.equals("Ken")){
		System.out.println("經理!!");
		break;
	    }
	}
	//java.lang.NullPointerException
	switch(names[1]){
	//switch(names[1]==null?"":names[1]){
	    case "Ken":
		System.out.println("T1");
		break;
	    case "Tom":
		System.out.println("T2");
		break;
	    default:
		System.out.println("Default");
		break;
	}
	
    }
    
}
