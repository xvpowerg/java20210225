/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210401.ch11_1_initblock;
import java.util.Arrays;

public class TestInitBlock {
    static String[] strA= new String[50000];
//    static{
//	Arrays.fill(strA, "");
//    }
    public TestInitBlock(){
	Arrays.fill(strA, "");
    }
}
