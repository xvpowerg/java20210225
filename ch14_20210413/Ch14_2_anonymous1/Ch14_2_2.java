/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_20210413.Ch14_2_anonymous1;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch14_2_2 {
//幫我把字串字元加總輸出!
  //內部類做看看  	    
  static void test1(String str,Function<String,Integer> func){
      System.out.println(func.apply(str));
  }
  static class SumStringFunc implements Function<String,Integer>{
      public Integer apply(String st){
	  int sum = 0;
	  for (int index = 0;index < st.length(); index++ ){
	      sum+=st.charAt(index);
	  }
	  return sum;
      }
  }
    public static void main(String[] args) {
	// TODO code application logic here
	SumStringFunc func = new SumStringFunc();
	 String  value = "Test:";		 
	test1("ABC",func);
	test1("QWER",new Function<String,Integer>(){
	    public Integer apply(String str){
		//value = "";//因為value必須是常數
		System.out.println(value);
		return str.length();
	    }
	});
    }
    
}
