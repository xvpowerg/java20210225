/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch21_20210506.stream2;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch21_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	//可設初始值
	//回傳值 是某一種類型
	int v = list.stream().reduce(0, (v1,v2)->{
	    System.out.println(v1+"_"+v2);
	    return v1+v2;
	});
	
	 ArrayList<String> nameList = new ArrayList();
	 nameList.add("Ken");
	 nameList.add("Vivin");
	 nameList.add("Lindy");
	 
	 String li = nameList.stream().reduce("", (n1,n2)->{
	     //System.out.println(n1+"_"+n2);
	 return n1+"<ul>"+n2+"</ul>";
	 });	 
	 System.out.println(li);
	 
	 
    }
    
}
