/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210429.Ch19_3_generic;

/**
 *
 * @author xvpow
 */
public class Ch19_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	MyList list = new MyList();
	list.add("Ken");
	list.add("Vivin");
	list.add("Lindy");	
	list.foreach(s->System.out.println(s));
	
	MyList<Integer> list2 = new MyList();
	list2.add(10);
	list2.add(20);
	list2.add(15);
	list2.foreach(v->System.out.println(v));
    }
    
}
