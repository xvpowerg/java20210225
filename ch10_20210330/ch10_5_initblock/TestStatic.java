/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210330.ch10_5_initblock;
import java.util.Arrays;
/**
 *
 * @author xvpow
 */
public class TestStatic {
    private static String[] array = new String[100];
    //會在任何方法呼叫前自動呼叫
    //靜態初始化區塊
    static {
	Arrays.fill(array, "");
    }
    public static void  staticFunc(){
	System.out.println(array[6]);
    }
}
