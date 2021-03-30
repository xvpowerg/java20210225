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
public class Ch10_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//StringBuffer //執行序安全
	
	StringBuilder sb = new StringBuilder();
	sb.append("A");
	sb.append("B");
	sb.append("C");
	sb.append("D");
	System.out.println(sb.toString());	
	System.out.println(sb.substring(1, 3));
	System.out.println(sb.toString());
	
	
    }
    
}
