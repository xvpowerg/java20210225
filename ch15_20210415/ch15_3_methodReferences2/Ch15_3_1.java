/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210415.ch15_3_methodReferences2;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Ch15_3_1 {

    static void test1(BiFunction<String,Integer,String> f,
	    String ...msg){
	for (String m : msg){
	    System.out.println(f.apply(m,m.length()));
	}
    }
    static String strAndLen(String s,Integer len){
	return s+":"+len;
    }
    static void newAnimal(int age,Function<Integer,Animal> func){
	Animal an = func.apply(age);
	System.out.println(an);
    }
    public static void main(String[] args) {
	// TODO code application logic here
	test1(Ch15_3_1::strAndLen,"AB","ABC","ABCD");
	newAnimal(25,Animal::new);
	
    }
    
}
