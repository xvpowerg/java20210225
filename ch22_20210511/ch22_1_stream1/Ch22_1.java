/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch22_20210511.ch22_1_stream1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Ch22_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	ArrayList<String> list = new ArrayList<>();
	list.add("Ken");
	list.add("Vivin");
	list.add("Lindy");
	list.add("Joy");
	list.add("Iris");
	list.add("Lucy");	
	
	List<String> filterList = list.stream().filter(n->n.length() > 3).
		collect(Collectors.toList());
	filterList.forEach(v->System.out.println(v));
	
	ArrayList list2 = list.stream().filter(n->n.length() > 3).
		collect(Collectors.
		toCollection(ArrayList::new));
	list2.forEach(v->System.out.println(v));


//Key不可重複	
    Map<String,Integer> map = 
	    list.stream().collect(Collectors.toMap(k->k, v->v.length()));	
    map.forEach((k,v)->System.out.println(k+":"+v));
    }
    
}
