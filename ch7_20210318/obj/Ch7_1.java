/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210318.obj;

/**
 *
 * @author xvpow
 */
public class Ch7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Person p1 = new Person();
	p1.setName("Vivin");
	p1.setHeight(165.8f);
	p1.setAge(25);
	p1.printInfo();
	
	Person p2 = new Person("鮭魚太郎",
		25,175);
	p2.printInfo();
	
	Person p3= new Person();
	p3.printInfo();
    }
    
}

