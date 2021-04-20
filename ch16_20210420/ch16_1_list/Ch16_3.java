/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210420.ch16_1_list;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch16_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Item i1 = new Item("A",100);
	Item i2 = new Item("B",300);
	Item i3 = new Item("C",200);
	Item i4 = new Item("B",300);
	
	ArrayList<Item> list  = new ArrayList<>();
	list.add(i1);
	list.add(i2);
	list.add(i3);
	
	list.forEach(System.out::println);
	list.remove(i4);
	System.out.println();
	System.out.println("====================");
	list.forEach(System.out::println);
	
	System.out.println(i2.equals(i4));
	
    }
    
}
