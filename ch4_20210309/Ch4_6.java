/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20210309;
import java.math.BigDecimal;
/**
 *
 * @author xvpow
 */
public class Ch4_6 {


    public static void main(String[] args) {
	long v=1;
	BigDecimal base = new BigDecimal("1");	
	for(long n=1;n<=50;n++){	    
	  base = base.multiply(new BigDecimal(n));
	}
	System.out.println(base.toString());
		
    }
    
}
