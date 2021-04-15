/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210415.ch15_4_enum;

/**
 *
 * @author xvpow
 */
public class Ch15_4_2 {
    enum Animal{
	DOG,
	CAT,
	TIGER("跳跳虎!");
	private String  name;
	// 建構式必須私有
	 private Animal(){
	    name = name();
	}
	private Animal(String name){
	    this.name = name;
	}
	
	public String getName(){
	    return name;
	}
    }
    public static void main(String[] args) {
	// TODO code application logic here
	
	Animal a1 = Animal.TIGER;
	System.out.println(a1.getName());
	Animal a2 = Animal.DOG;
	System.out.println(a2);
    }
    
}
