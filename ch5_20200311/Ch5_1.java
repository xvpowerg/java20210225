/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20200311;

/**
 *
 * @author xvpow
 */
public class Ch5_1 {
    
    static int test1(int v1,int v2){
	int ans = v1+v2;
	return ans;
    }
    
    //Stack FILO
    //Queue FIFO
    public static void main(String[] args) {
	    int a1 = 5;
	    int b2 = 3;
	    int v = test1(a1,b2);
	    System.out.println(v);
    }    
}
