/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20210427;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
/**
 *
 * @author xvpow
 */
public class Ch18_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	HashMap<String,Integer> map = new HashMap();
	map.put("A", 30);
	map.put("B", 20);
	map.put("C", 50);
	map.put("D", 16);
	map.put("E", 20);
	map.put("F", 50);
	map.put("G", 16);
	HashMap<Integer,String> groupMap = new HashMap();
	Set<Entry<String,Integer>> entrySet =  map.entrySet();
	//請找出 相同數字的所有key 
	for (Entry<String,Integer> en :entrySet){
	    String str=en.getKey();
	    if (groupMap.containsKey(en.getValue())){		
			str = str +" "+groupMap.get(en.getValue());
	    }
	    groupMap.put(en.getValue(), str);
	}
	System.out.println(groupMap);
    }
    
}
