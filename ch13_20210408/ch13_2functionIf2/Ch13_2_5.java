/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210408.ch13_2functionIf2;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */

class Filter1 implements Predicate<Integer> {
    public boolean test(Integer v){
	//(v & 1) != 1 表示偶數
	return (v & 1) != 1; 
    }
}
public class Ch13_2_5 {

    static void printVargs(Predicate<Integer> filter,int...values){
	for (int v : values){
	    if (filter.test(v)){
		System.out.println(v);
	    }
	}
    }
    public static void main(String[] args) {
	// TODO code application logic here
	Filter1 f1 = new Filter1();
	printVargs(f1,8,6,1,5,9,12,7);
    }
    
}
