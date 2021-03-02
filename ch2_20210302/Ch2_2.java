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
public class Ch2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//0~35低
	//36~53中
	//54~70高
	//71非常高
	int pm25= 53 ;
	if (pm25 <= 35)	    
	   System.out.println("低");
	else if(pm25 <=53)
	   System.out.println("中"); 
	else if(pm25<= 70)
	   System.out.println("高"); 
	else
	    System.out.println("非常高"); 
	
	
	
    }
    
}
