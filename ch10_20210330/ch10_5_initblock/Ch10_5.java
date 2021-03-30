/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210330.ch10_5_initblock;

/**
 *
 * @author xvpow
 */
public class Ch10_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//初始化區塊
	TestStatic t1 = new TestStatic();
	t1.staticFunc();
	//推薦
	TestStatic.staticFunc();
    }
    
}
