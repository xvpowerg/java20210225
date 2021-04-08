/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210408.ch13_2functionIf2;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class TestConsumer {
    private String[] msgs = {"Test1","Test2","Test3","Test4"};
    public void printMsg(Consumer<String> func){
	if (func == null) return;
	for(String msg : msgs){
	    func.accept(msg);
	    //System.out.println("msg:"+msg);
	}
    }
}
