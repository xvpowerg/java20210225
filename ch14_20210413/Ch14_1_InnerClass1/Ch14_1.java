/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_20210413.Ch14_1_InnerClass1;

/**
 *
 * @author xvpow
 */
public class Ch14_1 {
    
    
    
    public static void main(String[] args) {
	
	Student st1 = new Student("Ken",3);
	st1.appendGrades("國文", 85);
	st1.appendGrades("數學", 72);
	st1.appendGrades("理化", 95);
	st1.foreachGrades();
	
	
    }
    
}
