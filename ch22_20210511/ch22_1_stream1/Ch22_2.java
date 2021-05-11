/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch22_20210511.ch22_1_stream1;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author xvpow
 */
public class Ch22_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
	list.add("Ken");
	list.add("Vivin");
	list.add("Lindy");
	list.add("Joy");
	list.add("Iris");
	list.add("Lucy");
	list.add("Ken");
	//key可重複
	Map<String,Integer> map = list.stream().collect(Collectors.toMap(k->k, 
		v->v.length(), (v1,v2)->{
		    //key重複才會執行
		    System.out.println(v1+":"+v2);
		return v1+v2;
		}));
	map.forEach((k,v)->System.out.println(k+":"+v));
    }
    
}
