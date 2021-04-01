/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210401.ch11_1_initblock;
import java.util.Arrays;
public class InitBlock {

    int[] array = new int[5000];
    String tag = "";
    {
	
	//每個建構式都要呼叫的初始化
    Arrays.fill(array, -1);
    }
    
    InitBlock(){ }
    InitBlock(String tag){
	//this();
	this.tag = tag;
    }
    InitBlock(String tag,int value2){
	this(tag);
    }
    
}
