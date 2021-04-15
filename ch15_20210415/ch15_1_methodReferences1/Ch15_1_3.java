/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210415.ch15_1_methodReferences1;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class Ch15_1_3 {

	static void testNew(String des,Supplier<Tool> toolSupp){
	    Tool tool = toolSupp.get();
	    tool.setDes(des);
	    System.out.println(tool);
	}
    public static void main(String[] args) {
	//使用lambda.....
	testNew("工具人1",()->new Tool());
	//methodReferences 用於建構式
	testNew("工具人2",Tool::new);
    }
    
}
