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
public class Ch5_3 {
    
    static void tail(int n){
	if (n < 0) return;
	System.out.println(n);
	tail(n-1);
    }
    
    static void head(int n){
	if (n < 0) return;
	head(n-1);
	System.out.println(n);
    }
    static void tree(int n){
	if (n <= 0) return;
	System.out.println(n);
	tree(n-1);
	tree(n-1);
    }
    
    
    public static void main(String[] args) {
	//  遞迴 Recursion
	//Tail
	//tail(5);
	//Head
	//head(5);
	//Tree
	tree(3);
    }
    
}
