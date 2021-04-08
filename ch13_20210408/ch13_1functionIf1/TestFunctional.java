/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210408.ch13_1functionIf1;
//@FunctionalInterface  可驗證是否為FunctionalInterface
@FunctionalInterface
public interface TestFunctional {
    void print();
    default void test(){
	
    }
    static void test2(){
	
    }
}
