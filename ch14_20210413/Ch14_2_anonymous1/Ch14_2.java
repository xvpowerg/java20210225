/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_20210413.Ch14_2_anonymous1;

/**
 *
 * @author xvpow
 */
public class Ch14_2 {
    
    
    /**
     * 匿名內部類
     */
    public static void main(String[] args) {
	Dog dog1 = new Dog();
	dog1.bark();
	//喵喵 在這一行bark() 喵喵!!
	Dog dog2 = new Dog(){
	    public void bark(){
		    System.out.println("喵喵");
	    }
	};
	dog2.bark();
    }
    
}
