/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20210427;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author xvpow
 */
public class Ch18_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Item i1 = new Item("A",100);
	Item i2 = new Item("B",300);
	Item i3 = new Item("C",120);
	Item i4 = new Item("D",160);
	Item i5 = new Item("E",320);
	Item i6 = new Item("F",550);
	Item i7 = new Item("G",520);
	Item i8 = new Item("H",100);
	Item i9 = new Item("I",620);
	Item i10 = new Item("J",310);
	ArrayList<Item> list = new ArrayList<>();
	list.add(i1);
	list.add(i2);
	list.add(i3);
	list.add(i4);
	list.add(i5);
	list.add(i6);
	list.add(i7);
	list.add(i8);
	list.add(i9);
	list.add(i10);
	//幫我把 金額 1xx一群  2xx 一群
	HashMap<Integer,TreeSet<Item>> map = new HashMap();
	Comparator<Item> comp = Comparator.<Item,Integer>
		comparing(it->it.getPrict()).
		thenComparing(it->it.getName());
	for(Item it : list){
	    int key = it.getPrict() / 100;
	    TreeSet<Item> set = new TreeSet(comp);
	    set.add(it);
	    map.merge(key, set, (v1,v2)->{
			    v1.addAll(v2);
			    return v1;
	    });
	}
	System.out.println(map);
	
	//並且排序 金額 小到大排序 
    }
    
}
