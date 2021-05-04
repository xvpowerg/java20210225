/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch20_20210504.Ch20_5_stream2;
import java.util.stream.Stream;
import java.util.ArrayList;
public class Ch20_5 {

    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList();
	list.add("Ken");
	list.add("Vivin");
	list.add("Lindy");
	list.add("Joy");
	String v1= list.stream().findFirst().get();
	String v2 = list.stream().findAny().get();
	System.out.println(v1+":"+v2);
    }
    
}
