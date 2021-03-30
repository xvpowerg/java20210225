/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210330.ch10_3_string;

/**
 *
 * @author xvpow
 */
public class Ch10_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	String s1 = "123456789";
	String s2 = s1.substring(4);
	System.out.println(s2);
	//(1,8]
	String s3 = s1.substring(1,8);
	System.out.println(s3);
	//3456
	String s4 = s1.substring(2, 6);
	System.out.println(s4);
	String  s5 = "java,C#,Go,C++";
	String[] sArray = s5.split(",");
	for (String v : sArray){
	    System.out.print(v+" ");
	}
	System.out.println();
	String  s6 = "java,C#,Go,C++";
	//找不到-1找到回傳相對應字串的index
	int index = s6.indexOf("C#");
	System.out.println(index);
	String s7 = s6.replaceAll(",",":");
	System.out.println(s6);
	System.out.println(s7);
    }
    
}
