/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210408.ch13_2functionIf2;
import java.util.function.Function;
class ToStringLen implements Function<String,Integer>{
    public Integer apply(String str){
	return str.length();
    }
}
class ToStringCharSum implements Function<String,Integer>{
    public Integer apply(String str){
	int sum= 0;
	for (int i =0;i < str.length();i++){
	    sum+=str.charAt(i);
	}
	return sum;
    }
}
public class Ch13_2_3 {
//Function<T,R> R	apply(T t) 轉換

    static int testFunction(String str,Function<String,Integer> func){
	return func.apply(str);
    }
    
    
    public static void main(String[] args) {
	int len = testFunction("ABCDE",new ToStringLen());
	System.out.println(len);
	int sum = testFunction("ABCDE",new ToStringCharSum());
	System.out.println(sum);
    }
    
}
