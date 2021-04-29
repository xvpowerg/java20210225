 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210429.Ch19_1_treemap;

import java.util.TreeMap;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author xvpow
 */


public class Ch19_2 {
    private static class ItemCmp implements Comparator<Item>{
	private SortType sortType;
	ItemCmp(){ this(1);}
	ItemCmp(int sortType){
	    this.sortType = SortType.getSortType(sortType);
	}
	@Override
	public int compare(Item o1, Item o2) {
	  int cmp = o1.getId() - o2.getId();
	  if (cmp == 0 ){
	      cmp = o1.getItName().compareTo(o2.getItName());
	  }
	  return cmp * sortType.getOffSet();
	}
    }
    public static void main(String[] args) {
	// TODO code application logic here
	Item i1 = new Item("A",20);
	Item i2 = new Item("B",60);
	Item i3 = new Item("C",70);
	Item i4 = new Item("D",20);
	Item i5 = new Item("E",15);
	//輸入1 小到大
	//輸入2 大到小
	//其他 都是小到大
	Scanner scan = new Scanner( System.in);
	int sortType = scan.nextInt();
	
 	ItemCmp cmp = new ItemCmp(sortType);
	TreeMap<Item,String> map = new TreeMap(cmp);
	map.put(i1, "高雄");
	map.put(i2, "台北");
	map.put(i3, "台中");
	map.put(i4, "台北");
	map.put(i5, "高雄");
	//希望id排序
	map.forEach((k,v)->System.out.println(k+":"+v));
	
    }
    
}
