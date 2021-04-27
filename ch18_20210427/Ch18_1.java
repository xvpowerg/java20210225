/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20210427;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
public class Ch18_1 {
    public static void main(String[] args) {
	Map<String,Integer> map = new HashMap<>();
	map.put("Ken",20);
	map.put("Vivin",65);
	map.put("Join",75);
	map.put("Lucy",83);
	
	System.out.println(map.get("Join"));
	
//	Set<Entry<String,Integer>> set = map.entrySet();
//	for (Entry<String,Integer> e : set){
//	    System.out.println(e.getKey()+":"+e.getValue());
//	}
	map.put("Vivin", 25);
	map.forEach((k,v)->{System.out.println(k+":"+v);} );
	
	
	
    }
    
}
