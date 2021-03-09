/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20210309;

/**
 *
 * @author xvpow
 */
public class Ch4_4 {
    public static void main(String[] args) {
	//args 未輸入參數長度是0
	//for (String action : args){
	if (args.length!=0){
	    	String action = args[0];
	    switch(action){
		case "play":
		    System.out.println("撥放");		
		    if(args.length > 1){
			String second = args[1];
		        System.out.println(second+"秒");
		    }		    
		    break;		    		    
	    }
	} 
//BigDecimal
	    
	    
	
    }
    
}
