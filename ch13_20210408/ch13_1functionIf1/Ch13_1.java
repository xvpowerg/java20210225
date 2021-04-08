/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210408.ch13_1functionIf1;

/**
 *
 * @author xvpow
 */
public class Ch13_1 {

   static void test1(TestFunctional tf){
       tf.print();
   }
    public static void main(String[] args) {
	  MyFunc myfunc = new MyFunc();
	  test1(myfunc);
    }
    
}
