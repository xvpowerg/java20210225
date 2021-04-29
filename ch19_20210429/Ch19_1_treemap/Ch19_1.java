/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210429.Ch19_1_treemap;
import java.util.TreeMap;
public class Ch19_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	TreeMap<Integer,String> map = new TreeMap();
	map.put(10, "Vivin");
	map.put(5, "Lindy");
	map.put(3, "Ken");
	map.put(8, "Lindy");
	map.forEach((k,v)->System.out.println(k+":"+v));
	
	
    }
    
}
