/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210330.ch10_2_obj;

/**
 *
 * @author xvpow
 */
public class Test1 {
    private String msg;
    public Test1(String msg){
	this.msg = msg;
    }
    public String toString(){
	return msg;
    }
    @Override
    public boolean equals(Object obj){
	//強制轉型
	//因為要取得msg屬性
	//n instanceof X n是否為X類別 是回傳true 
	if (obj == null || obj instanceof Test1 == false){
	    return false;
	}
	Test1 t1 = (Test1)obj;
	return msg.equals(t1.msg);
    }
}
