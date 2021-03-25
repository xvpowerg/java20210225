/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210325.ch9_1_override1;

/**
 *
 * @author xvpow
 */
public class Ch9_1 {

       /**
     * override 規則
     * 1 讀取權限只能開放不能封閉
     * 2 回傳值如果是基本型態 必須一樣
     * 3 回傳值如果是參考型態 可以是子類或一樣
     * 4 方法名稱與參數一定要一樣
     * 5 例外拋出可以是 一樣 子類 或不拋出
     */
    public static void main(String[] args) {
	Test1 t1 = new Test1();
	  t1.newTest().print();
	Test1 t2 = new Test2();
	  t2.newTest().print();
    }
    
}
