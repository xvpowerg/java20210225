/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210330.ch10_3_string;

/**
 *
 * @author xvpow
 */
public class Ch10_3 {
// 比較2字串是否相等
   static boolean  cmp(String s1,String s2){
       if (s1 == null || s2==null  || s1.length() != s2.length()){
	   return false;
       }
       for (int i=0;i < s1.length();i++){
	   if (s1.charAt(i) != s2.charAt(i)){
	       return false;
	   }
       }
      return true;
   }
    public static void main(String[] args) {
	String st1 = "ABCD1EF";
	char c = st1.charAt(3);
	System.out.println(c);
	System.out.println("==================");
	for (int i=0;i < st1.length();i++){
	    char testC = st1.charAt(i);
	    if (!Character.isLetter(testC)){
	        break;
	    }
	    System.out.print(testC);
	}
	System.out.println();
	System.out.println(cmp("ABC","ABC"));
	
	
    }
    
}
