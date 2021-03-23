/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210323.override;

/**
 *
 * @author xvpow
 */
public class Ch8_5 {

    /**
     * override 規則
     * 1 讀取權限只能開放不能封閉
     */
    public static void main(String[] args) {
	Test1 t1 = new Test2();
	t1.publicMethod();
	t1.testProtected();
	t1.testDefault();
    }
    
}
