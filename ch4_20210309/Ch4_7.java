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
public class Ch4_7 {

    //長參數 ... 就是陣列
    static int min(int... values){
	int min = Integer.MAX_VALUE;
	for (int v : values){
	    if (v  < min) min = v;	    
	}  	
	return min;
    }
    public static void main(String[] args) {
	System.out.println(min(87,2,1,3,8));
    }
    
}

