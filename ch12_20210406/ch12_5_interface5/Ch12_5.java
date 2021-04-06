/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210406.ch12_5_interface5;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class Ch12_5 {
    //介面靜態方法 不會被繼承
    public static void main(String[] args){
	TestIF myClass = new MyClass();
	//myClass.myTest();
	//只能透過介面呼叫
	TestIF.testStatic();
	 TestIF3 testIF3 =  TestIF3.newTestIF3(15);
	 System.out.println(testIF3.test(15));
    }
}
