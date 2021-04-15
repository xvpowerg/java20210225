/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210415.ch15_2_practice;
import java.util.function.Function;
//import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class Ch15_2 {
// 使用java的functional interface 做事
   //1 array 字串內容轉為大寫     
    static void test1(String[] array,Function<String,String>func){
	for (int i = 0; i < array.length;i++){
	    array[i] = func.apply(array[i]);
	}
    }
    
    public static void main(String[] args) {
	// TODO code application logic here
	String[] names = {"ken","vivin","lindy"};
	test1(names,s->s.toUpperCase());
	for(String n : names){
	    System.out.println(n);
	}
    }
    
}
