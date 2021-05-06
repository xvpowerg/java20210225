/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch21_20210506.stream1;
import java.util.ArrayList;
public class Ch21_1 {

    
    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
	list.add("Ken");
	list.add("Vivin");
	list.add("Lindy");
	list.add("Joy");
	//每個條件都要符合回傳true 且 &
	boolean b1 = list.stream().peek(v->System.out.println("allMatch:"+v)).
		allMatch(v->v.length() >2);
	System.out.println(b1);
	//allMatch 會短路
	 b1 = list.stream().peek(v->System.out.println("allMatch2:"+v)).
		allMatch(v->v.length() >3);	
	//其中一條件符合回傳true 或 OR
	//只其中一元素符合條件就短路
	boolean b2 = list.stream().peek(v->
		System.out.println("anyMatch:"+v)).anyMatch(v->v.length() > 3);
	System.out.println(b2);
	
	//其中一條件符合回傳false  OR的反向
	//只其中一元素符合條件就短路
	boolean b3 = list.stream().peek(v->System.out.println("noneMatch:"+v)).
		noneMatch(v->v.length() > 3);
	System.out.println(b3);
	
	
    }
    
}
