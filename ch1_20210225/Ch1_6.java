/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20210225;

/**
 *
 * @author xvpow
 */
public class Ch1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int n1 = 0b101101;//45
	int n2 = 0b110110;//54
	// &       100100 
	System.out.println(n1+":"+n2);
	//遮罩
	System.out.println(n1 & n2);
    }
    
}
