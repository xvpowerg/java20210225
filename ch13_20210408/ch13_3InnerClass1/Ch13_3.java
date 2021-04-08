/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210408.ch13_3InnerClass1;

/**
 *
 * @author xvpow
 */
public class Ch13_3 {

   //private static class TestStaticClass{
    static class TestStaticClass{
      private int value;
      TestStaticClass( int value){
	  this.value = value;
      }
      public String toString(){
	 return "TestStaticClass:"+value;
      }
  }    
    public static void main(String[] args) {
	//內部類有三種 可擁有所有的modifly
	//靜態內部類
	//非靜態內部類
	//匿名內部類
	TestStaticClass tsc = new TestStaticClass(10);
	System.out.println(tsc);
    }
    
}
