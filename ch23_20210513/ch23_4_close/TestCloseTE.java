/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch23_20210513.ch23_4_close;

/**
 *
 * @author xvpow
 */
public class TestCloseTE implements AutoCloseable{
    private String msg;
    public TestCloseTE(String msg){
	this.msg = msg;
    }
    public void close()throws Exception{
	 System.out.println("close:"+msg);
	 throw new Exception("Ex:"+msg);
    }
}
