/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210401.ch11_3_Shade;

/**
 *
 * @author xvpow
 */
public class Ch11_3 {

   /**
     * 遮蔽  一定有繼承
     * 1 所有靜態的
     * 2 所有的屬性
     * 遮蔽 看類別
     * 覆寫 看物件
     */
    public static void main(String[] args) {
//	Test1 t1 = new Test2();
//	System.out.println(t1.value1);

	Test3 t3 = new Test4();
	//t3.value = 72;
	t3.setValue(95);
	System.out.println(t3);

    }
    
}
