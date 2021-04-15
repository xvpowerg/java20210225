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
public class Ch15_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	Student st1 = new Student("Tom",2);
	st1.appendPaents("Ken");
	st1.appendPaents("Iris");
	st1.foreachParents();
	//非靜態的methodReferences 呼叫方式
	st1.foreachParents(st1::defaultEachStyle);
	//非靜態的methodReferences 呼叫方式
	Person p1 = new Person("Lucy");
	st1.foreachParents(p1::printParents);
    }
    
}
