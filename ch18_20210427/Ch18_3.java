/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20210427;

import java.util.HashMap;
public class Ch18_3 {
    public static void main(String[] args) {
	HashMap<String,Integer> map = new HashMap<>();
	map.put("A", 30);
	map.put("B", 20);
	map.put("C", 50);
	map.put("D", 16);
	
	//Key 存在不存在 都會運行function
	//map.compute(key, remappingFunction)
	map.compute("B", (k1,v1)->{	    
	    System.out.println("compute:"+k1+":"+v1);
		return v1+10;
	});
	System.out.println(map.get("B"));
	
	map.compute("E", (k1,v1)->{
		System.out.println("compute not key "+k1+":"+v1);
		return 80;
	});
	System.out.println(map.get("E"));
	//Key 不存在 會運行function
	//map.computeIfAbsent(key, mappingFunction)
	map.computeIfAbsent("F", (k)->{
	    System.out.println("computeIfAbsent:"+k);	    
	    return 95;
    	});
	System.out.println(map.get("F"));
	//Key 存在 會運行function
	//map.computeIfPresent(key, remappingFunction)
	map.computeIfPresent("C", (k,v)->{
	   System.out.println("computeIfPresent:"+k+":"+v);
	return v +20;
	});
	System.out.println(map.get("C"));
    }
    
}
