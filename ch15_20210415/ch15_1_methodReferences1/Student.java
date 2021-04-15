/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210415.ch15_1_methodReferences1;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private String[] parents;
    private int index = 0;
    Student(String name,int parentCount){
	   parents = new String[parentCount];
	   this.name = name;
    }    
    public void appendPaents(String name){
	parents[index++] = name;
    }
    
    public void foreachParents(Consumer<String> eachStyle){
	for (String name : parents){
	    eachStyle.accept(name);
	}
    }
     public void foreachParents(){
	 //因為我在Student 類別內　呼叫非靜態methodReferences
	 //可使用this::
	 foreachParents(this::defaultEachStyle);	 
     }
     
    void defaultEachStyle(String pName){
	System.out.println("學生:"+name+":"+pName);
    }
}
