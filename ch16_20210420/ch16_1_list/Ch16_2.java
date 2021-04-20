/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210420.ch16_1_list;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch16_2 {
static void printList(String msg,List<Integer> data){
       System.out.println("=====Start "+msg+"=====");
    for (int v : data){
	System.out.print(v+" "); 
    }
     System.out.println();
      System.out.println("=====End "+msg+"=====");
}
 
    public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList();
	list.add(10);
	list.add(30);
	list.add(50);
	list.add(18);
	printList("原始",list);
	list.add(1, 25);
	printList("插入",list);
	List<Integer> myList = new ArrayList<>();
	myList.add(100);
	myList.add(250);
	list.addAll(myList);
	printList("合併",list);
	System.out.println(list.contains(50));
	//找不到回傳-1
	//左往右找
	int index = list.indexOf(18);
	System.out.println(index);
	list.remove(Integer.valueOf(30));
	//list.remove(2);
	printList("刪除",list);
	//刪除大於90數值?
	list.removeIf(v->v>90);
	printList("removeIf",list);
	list.replaceAll(v->v+2);
	printList("replaceAll",list);
	//小到大排序
	list.sort(Comparator.comparing(v->v));
	printList("sort",list);
    }
    
}
