/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210415.ch15_1_methodReferences1;
import java.util.function.Function;
/*

MethodReferences
作用:lambda很複雜時 不好閱讀 可使用MethodReferences簡化
1 建立一組方法
2 方法 參數 與 回傳值類型必須跟 Interface一樣
*/
public class Ch15_1 {
    static Integer strToCharSum(String s){
	 int sum = 0;
	    for(int i =0;i < s.length();i++){
		sum +=s.charAt(i);
	     }
	      if (sum % 2 != 0){
		  sum+=1;
	      }
	    return sum;
    }
    static void testMR(Function<String,Integer> f,String ... values){
	for (String s : values){
	   System.out.println(f.apply(s)); 
	}	
    }
    public static void main(String[] args) {
	//靜態Method References 寫法
	testMR(Ch15_1::strToCharSum,"Ken","Vivin","Lindy");
	
//	testMR(s->{
//	    int sum = 0;
//	    for(int i =0;i < s.length();i++){
//		sum +=s.charAt(i);
//	     }
//	      if (sum % 2 != 0){
//		  sum+=1;
//	      }
//	    return sum;},"Ken","Vivin","Lindy");
	
	
	
    }
    
}
