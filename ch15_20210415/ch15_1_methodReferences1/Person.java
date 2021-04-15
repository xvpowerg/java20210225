/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210415.ch15_1_methodReferences1;

/**
 *
 * @author xvpow
 */
public class Person {
	private String name;
	Person(String name){
	    this.name = name;
	}
      void printParents(String pName){
	System.out.println("姓名:"+name+" 家長:"+pName);
	}
}
