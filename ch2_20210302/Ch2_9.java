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
public class Ch2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	int i =10;
	
	while(--i >=0){
	    System.out.println(i);
	}
	
	//一定會執行次
	int x= 2;
	do{
	    System.out.println("do while!");
	}while(x > 5);
	
	
    }
    
}
