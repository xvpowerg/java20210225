/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210401.ch11_4_abstract;

/**
 *
 * @author xvpow
 */
public class  Dog extends Animal{
    public Dog(String name,int height){
	super(name,height);
    }
    public void skill(){
	System.out.println("Dog Skill");
    }
}
