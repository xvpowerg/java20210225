/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210420.ch16_1_list;
import java.util.ArrayList;
public class Ch16_1 {

    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Ken");//0
    list.add("Vivin");//1
    list.add("Lindy");//2
    
    for (int i=0;i < list.size();i++){
	System.out.println(list.get(i));
    }
    System.out.println("=================");
    for(String v: list){
	System.out.println(v);
    }
    System.out.println("=================");
    list.forEach(v->System.out.println(v));
	
	
    }
    
}
