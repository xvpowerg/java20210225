/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210401.ch11_2_static;

/**
 *
 * @author xvpow
 */
public class TestStatic {
    //共享區塊
    static int staticValue;
    //各自獨立
    float notStaticValue;
    TestStatic(int inStaticValue,float inNotStaticValue){
	staticValue = inStaticValue;
	notStaticValue = inNotStaticValue;
    }
    public String toString(){
	return "staticValue:"+staticValue+" notStaticValue:"+notStaticValue;
    }
}
