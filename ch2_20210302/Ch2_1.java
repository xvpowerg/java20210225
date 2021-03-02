/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20210302;

/**
 *
 * @author xvpow
 */
public class Ch2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int n = 12;
	if (n %2 ==0){
	    System.out.println("偶數");
	}else{
	    System.out.println("奇數");
	}
	//只有一行命令可不用加上{}
       if(n > 3) 
	   System.out.println("n大於3");
       else 
	   System.out.println("不大於3");
           System.out.println("或小於3"); 
	
	   int age = 18;
	   String  msg = age > 18?"成年":"未成年";
	   System.out.println(msg);
	   
	   
    }
    
}
