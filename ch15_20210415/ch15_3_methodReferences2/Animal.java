/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210415.ch15_3_methodReferences2;

/**
 *
 * @author xvpow
 */
public class Animal {
    private int age;
    Animal(int age){
	this.age = age;
    }
    public String toString(){
	return "Animal:"+this.age;
    }
}
