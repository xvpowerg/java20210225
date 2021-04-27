/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17_20210422.ch17_1_TreeSet;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch17_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	Item i1 = new Item("A",10,5);
	Item i2 = new Item("B",10,7);
	Item i3 = new Item("C",14,2);
	Item i4 = new Item("D",26,8);
	Item i5 = new Item("E",18,7);
	Item i6 = new Item("B",10,18);
	TreeSet<Item> set = new TreeSet<>();
	set.add(i1);
	set.add(i2);
	set.add(i3);
	set.add(i4);
	set.add(i5);
	set.add(i6);
	set.forEach(System.out::println);
    }
    
}

