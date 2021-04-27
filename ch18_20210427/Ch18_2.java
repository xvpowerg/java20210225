/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20210427;
import java.util.HashMap;
public class Ch18_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	HashMap<String,Integer> map = new HashMap();
	map.put("A", 30);
	map.put("B", 20);
	map.put("C", 50);
	map.put("D", 16);
	//當key不存在 
	if (!map.containsKey("B")){
	    map.put("B", 100);
	}
	System.out.println(map.get("B"));
	//當key不存在 才寫入
	map.putIfAbsent("C",95);
	System.out.println(map.get("C"));
	
	Integer v1 = map.get("E");
	int v2 = map.getOrDefault("E", -1);
	System.out.println(v1+":"+v2);
	//key存在 讓開發者決定是否要合併 新舊數值
	map.merge("C", 650, (v3,v4)->{
	System.out.println(v3+":"+v4);
	return v3+v4;
	});
	System.out.println(map.get("C"));
	//key不存在 就寫入map
	map.merge("X", 950,(v3,v4)->{
	    System.out.println(v3+":"+v4);
	    return -20;} );	
	System.out.println(map.get("X"));
    }
    
}
