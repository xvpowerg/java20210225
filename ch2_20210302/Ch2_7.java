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
public class Ch2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	//break離開
	//continue繼續下一次
	
	for(int i=1;i<=5;i++){
	    if (i == 3){
		//break;
		continue;
	    }
	    System.out.println(i);	    
	}
	
    }
    
}
