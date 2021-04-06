/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210406.ch12_3_interface3;

/**
 *
 * @author xvpow
 */
public class Ch12_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	VectorIF vector = new Vector();
	vector.add(10);
	vector.add(50);
	vector.add(25);
//	System.out.println(vector.get(0));
//	System.out.println(vector.get(1));
//	System.out.println(vector.get(2));
	vector.foreach();
//	for (int i = 0;i < vector.size();i++){
//	    System.out.println(vector.get(i));
//	}
System.out.println("=================");
	vector = new IntegerList();
	vector.add(25);
	vector.add(73);
	vector.add(64);
	vector.foreach();
    }
    
}
