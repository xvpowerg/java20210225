/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210330.ch10_4_Shade;

/**
 *
 * @author xvpow
 */
public class Ch10_4 {

    /**
     * 遮蔽  一定有繼承
     * 1 所有靜態的
     * 2 所有的屬性
     * 遮蔽 看類別
     * 覆寫 看物件
     */
    public static void main(String[] args) {
	Test1 t1 = new Test2();
	System.out.println(t1.value);
	t1.test();
	t1.fun();
    }
    
}
