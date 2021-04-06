/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210406.ch12_4_interface4;

/**
 *
 * @author xvpow
 */
public class Ch12_4 {

    public static void main(String[] args) {
	//default 名稱重複 extends 會錯誤 解決方案
	//1 改名
	//2 將 介面繼承 如 TestIF4 與 TestIF5的解法
	//3 在最後的子介面覆寫
	
	//2 將 介面繼承 如 TestIF4 與 TestIF5的解法
	TestIF4 myClass = new MyClass();
	myClass.testDefualt();
	
	//3 在最後的子介面覆寫
	TestIF7 myclass2 = new MyClass2();
	myclass2.testDefualt();
    }
    
}
