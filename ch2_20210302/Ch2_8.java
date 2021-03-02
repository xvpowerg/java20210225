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
public class Ch2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	tag:    	
	for (int i= 1;i<=5; i++){
	    System.out.println("Out Start :"+i);
	    for (int k= 1;k<=3;k++){
		System.out.print("Start Body:"+k+" ");
		if(i==3){
		   // break tag;
		   continue tag;
		}
		System.out.print("End Body:"+k+" ");
	    }
	    System.out.println();
	    System.out.println("Out End :"+i);
	}
	
	
    }
    
}
