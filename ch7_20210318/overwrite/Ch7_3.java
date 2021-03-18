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
public class Ch7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Student st1 = new Student("Ken",10,165);
	Teacher t1 = new Teacher("Iris",20,158);
	
	Person p1 = st1;
	p1.printInfo();
	p1 = t1;
	p1.printInfo();
	
	
    }
    
}
