/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20210427;
import java.util.TreeMap;
public class Ch18_8 {
    public static void main(String[] args) {
	TreeMap<Integer,String> map = new TreeMap<>();
	map.put(10, "Ken");
	map.put(8, "Lindy");
	map.put(3, "Lucy");
	map.put(1, "Iris");
	map.forEach((k,v)->System.out.println(k+":"+v));
	
    }
    
}
