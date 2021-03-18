/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210318.overwrite;

/**
 *
 * @author xvpow
 */
public class Ch7_3_2 {


    static void printPerson(Person ... p1){
	//可以幫我輸出 Student 與 Teacher
	//如無資料輸出 無資訊
	
	if (p1.length == 0){
	    System.out.println("無資訊");
	    return;
	}
	for (Person p : p1){
	    p.printInfo();
	}
    }
    public static void main(String[] args) {
	// TODO code application logic here
	Student st1 = new Student("St1",10,150);
	Teacher t1 = new Teacher("T1",25,165);
	Teacher t2 = new Teacher("T2",30,155);
	printPerson(st1,t1,t2);
		
    }
    
}
